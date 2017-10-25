package com.adrianjayson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class News {

    private String status;
    private String source;
    private String sortBy;
    private Article[] articles;

//    public News(String status, String source, String sortBy, Article[] articles) {
//        this.status = status;
//        this.source = source;
//        this.sortBy = sortBy;
//        this.articles = articles;
//    }


    public News() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "News{" +
                "status='" + status + '\'' +
                ", source='" + source + '\'' +
                ", sortBy='" + sortBy + '\'' +
                ", articles=" + Arrays.toString(articles) +
                '}';
    }
}
