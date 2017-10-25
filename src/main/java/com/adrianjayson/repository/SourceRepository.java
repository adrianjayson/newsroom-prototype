package com.adrianjayson.repository;

import com.adrianjayson.model.Source;

public class SourceRepository {
    private static String domain = "https://newsapi.org/v1";
    private static String apiKey = "4e17299fccae427b9b2e4783a736f54b";

    public static final Source[] SOURCES = {
            new Source("BBC", domain, "bbc-news", "top", apiKey),
            new Source("CNN", domain, "cnn", "top", apiKey),
            new Source("Reuters", domain, "reuters", "top", apiKey)
    };

    public static String getSourceName(String id) {
        for (Source source :
                SOURCES) {
            if (source.getId().equals(id)) {
                return source.getName();
            }
        }

        return id;
    }
}
