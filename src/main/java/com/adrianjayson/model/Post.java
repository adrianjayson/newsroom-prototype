package com.adrianjayson.model;

import com.adrianjayson.repository.SourceRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Post {
    private String source;
    private Article article;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private Date publishedAt;

    public Post(String source, Article article) {
        this.source = source;
        this.title = article.getTitle();
        this.description = article.getDescription();
        this.url = article.getUrl();
        this.urlToImage = article.getUrlToImage();
        this.publishedAt = article.getPublishedAt();
    }

    public String getSource() {
        return SourceRepository.getSourceName(source);
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        if (publishedAt == null) {
            return "";
        }
        SimpleDateFormat formatter = new SimpleDateFormat("MMM d, y hh:mm a");
        return formatter.format(publishedAt);
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "source='" + source + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                '}';
    }
}
