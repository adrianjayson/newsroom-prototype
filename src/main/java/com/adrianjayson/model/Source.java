package com.adrianjayson.model;

public class Source {
    private String name;
    private String category;
    private String domain;
    private String id;
    private String sortOrder;
    private String apiKey;

    public Source(String name, String category, String domain, String id, String sortOrder, String apiKey) {
        this.name = name;
        this.category = category;
        this.domain = domain;
        this.id = id;
        this.sortOrder = sortOrder;
        this.apiKey = apiKey;
    }

    public String getSourceUrl() {
        String url = String.format("%s/articles?source=%s&sortBy=%s&apiKey=%s", domain, id, sortOrder, apiKey);
        return url;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
}
