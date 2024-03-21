package com.elopez.design.patterns.creationals.builder.house;

public class House {
    private String wall;
    private String door;
    private String roof;
    private String window;
    private String garage;
    private String garden;
    private String swimmingPool;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public String toString() {
        return "{" +
                "wall='" + wall + '\'' +
                ", door='" + door + '\'' +
                ", roof='" + roof + '\'' +
                ", window='" + window + '\'' +
                ", garage='" + garage + '\'' +
                ", garden='" + garden + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                '}';
    }

}
