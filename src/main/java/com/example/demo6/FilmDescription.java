package com.example.demo6;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FilmDescription {
    private final StringProperty name = new SimpleStringProperty("");
    private final StringProperty url = new SimpleStringProperty("");



    public FilmDescription(String name, String url) {
        this.name.set(name);
        this.url.set(url);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        this.name.set(value);
    }

    public String getUrl() {
        return url.get();
    }

    public void setUrl(String value) {
        this.url.set(value);
    }
}
