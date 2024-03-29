package com.elopez.design.patterns.behaviorals.memento.app;

public class EditorMemento {
    private String title;
    private String text;

    public EditorMemento(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
