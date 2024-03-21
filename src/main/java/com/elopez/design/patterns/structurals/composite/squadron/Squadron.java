package com.elopez.design.patterns.structurals.composite.squadron;

import java.util.ArrayList;
import java.util.List;

public class Squadron implements SoldierInterface {
    private String name;
    private List<SoldierInterface> soldiers;

    public Squadron(String name) {
        this.name = name;
        soldiers = new ArrayList<>();
    }

    public void addSoldier(SoldierInterface soldier) {
        soldiers.add(soldier);
    }

    public void removeSoldier(SoldierInterface soldier) {
        soldiers.remove(soldier);
    }

    @Override
    public void respondToCommander() {
        System.out.println("Squadron " + name + " responding to commander");
        for (SoldierInterface soldier : soldiers) {
            soldier.respondToCommander();
        }
    }
}
