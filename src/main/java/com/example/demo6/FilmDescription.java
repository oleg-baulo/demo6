package com.example.demo6;

import javafx.scene.image.Image;

public class FilmDescription {
    private String name;
    private String url;

    public FilmDescription(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
