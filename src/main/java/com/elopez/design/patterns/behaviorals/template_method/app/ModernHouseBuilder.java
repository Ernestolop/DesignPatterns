package com.elopez.design.patterns.behaviorals.template_method.app;

public class ModernHouseBuilder extends HouseBuilder {
    @Override
    protected void buildFoundation() {
        System.out.println("Building a modern foundation.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building modern walls.");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building a flat roof for the modern house.");
    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing the modern house with contemporary furniture.");
    }

    @Override
    protected boolean hasGarden() {
        return false;
    }
}
