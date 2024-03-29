package com.elopez.design.patterns.behaviorals.memento;

import com.elopez.design.patterns.behaviorals.memento.app.Editor;
import com.elopez.design.patterns.behaviorals.memento.app.EditorMemento;
import com.elopez.design.patterns.behaviorals.memento.app.History;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.write("Title 1", "This is the first text.");
        System.out.println("First editor");
        System.out.println("Title: " + editor.getTitle());
        System.out.println("Text: " + editor.getText());

        history.add(editor.save());
        editor.write("Title 2", "This is the second text.");
        System.out.println("Second editor");
        System.out.println("Title: " + editor.getTitle());
        System.out.println("Text: " + editor.getText());

        EditorMemento memento = history.getLast();
        editor.restore(memento);
        System.out.println("Firs editor(restore)");
        System.out.println("Title: " + editor.getTitle());
        System.out.println("Text: " + editor.getText());
    }
}
