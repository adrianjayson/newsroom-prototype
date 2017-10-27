package com.adrianjayson.library;

import com.adrianjayson.model.Source;

public class SourceLibrary {
    private static String domain = "https://newsapi.org/v1";
    private static String apiKey = "4e17299fccae427b9b2e4783a736f54b";

    public static final Source[] SOURCES = {
            new Source("BBC", "headlines", domain, "bbc-news", "top", apiKey),
            new Source("CNN", "headlines", domain, "cnn", "top", apiKey),
            new Source("Reuters", "headlines", domain, "reuters", "top", apiKey),
            new Source("Engadget", "technology", domain, "engadget", "top", apiKey),
            new Source("TechCrunch", "technology", domain, "techcrunch", "top", apiKey),
            new Source("Bloomberg", "business", domain, "bloomberg", "top", apiKey),
            new Source("The Wall Street Journal", "business", domain, "the-wall-street-journal", "top", apiKey),
            new Source("National Geographic", "science", domain, "national-geographic", "top", apiKey),
            new Source("New Scientist", "science", domain, "new-scientist", "top", apiKey),
            new Source("BBC Sport", "sports", domain, "bbc-sport", "top", apiKey),
            new Source("ESPN", "sports", domain, "espn", "top", apiKey)
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
