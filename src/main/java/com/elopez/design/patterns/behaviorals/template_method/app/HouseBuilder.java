package com.elopez.design.patterns.behaviorals.template_method.app;

public abstract class HouseBuilder {
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        furnishHouse();
        if (hasGarden()) {
            addGarden();
        }
    }

    protected abstract void buildFoundation();

    protected abstract void buildWalls();

    protected abstract void buildRoof();

    protected abstract void furnishHouse();

    protected abstract boolean hasGarden();

    protected void addGarden() {
        System.out.println("Adding a garden to the house.");
    }
}
