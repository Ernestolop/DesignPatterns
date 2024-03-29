package com.elopez.design.patterns.behaviorals.memento.app;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorMemento> history;

    public History() {
        history = new ArrayList<>();
    }

    public void add(EditorMemento memento) {
        history.add(memento);
    }

    public EditorMemento getLast() {
        if (history.isEmpty())
            return null;
        int lastIndex = history.size() - 1;
        EditorMemento memento = history.get(lastIndex);
        history.remove(lastIndex);
        return memento;
    }

}
