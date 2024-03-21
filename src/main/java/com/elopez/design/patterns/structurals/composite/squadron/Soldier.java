package com.elopez.design.patterns.structurals.composite.squadron;

public class Soldier implements SoldierInterface{
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    public void respondToCommander() {
        System.out.println("Soldier " + name + " responding to commander");
    }
}
