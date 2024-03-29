package com.elopez.design.patterns.behaviorals.memento.app;

public class Editor {
    private String title;
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void write(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public EditorMemento save() {
        return new EditorMemento(title, text);
    }

    public void restore(EditorMemento memento) {
        title = memento.getTitle();
        text = memento.getText();
    }

}
