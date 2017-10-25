package com.adrianjayson.controller;

import com.adrianjayson.model.Article;
import com.adrianjayson.model.News;
import com.adrianjayson.model.Post;
import com.adrianjayson.model.Source;
import com.adrianjayson.repository.SourceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class FeedController {

    private static final Logger log = LoggerFactory.getLogger(FeedController.class);
    private List<Post> posts = new ArrayList<>();

    @RequestMapping("/show-news")
    public String showNews(ModelMap modelMap) {
        if (this.posts.size() > 0) {
            this.posts.clear();
        }
        fetchNews(SourceRepository.SOURCES);
        sortPostsToLatest();

        modelMap.put("posts", this.posts);
        modelMap.put("sourceCount", this.posts.size());
        return "show-news";
    }

    private void fetchNews(Source[] sources) {
        RestTemplate restTemplate = new RestTemplate();
        for (Source source :
                sources) {
            News news = restTemplate.getForObject(source.getSourceUrl(), News.class);
            addToPosts(news);
        }
    }

    private void sortPostsToLatest() {
        Collections.sort(posts, new Comparator<Post>() {
            @Override
            public int compare(Post post, Post t1) {
                int v = post.getPublishedAt().compareTo(t1.getPublishedAt());

                return v;
            }
        });
        Collections.reverse(posts);
    }

    private void addToPosts(News news) {
        for (Article article :
                news.getArticles()) {
            this.posts.add(new Post(news.getSource(), article));
        }
    }
}
