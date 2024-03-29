package com.elopez.design.patterns.behaviorals.template_method.app;

public class TraditionalHouseBuilder extends HouseBuilder {
    @Override
    protected void buildFoundation() {
        System.out.println("Building a traditional foundation.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building traditional walls with bricks.");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building a sloped roof for the traditional house.");
    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing the traditional house with classic furniture.");
    }

    @Override
    protected boolean hasGarden() {
        return true;
    }

    @Override
    protected void addGarden() {
        System.out.println("Adding a garden to the house. Overwrite");
    }
}
