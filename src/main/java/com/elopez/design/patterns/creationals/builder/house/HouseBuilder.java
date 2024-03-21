package com.elopez.design.patterns.creationals.builder.house;

public class HouseBuilder {
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

    public String getDoor() {
        return door;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindow() {
        return window;
    }

    public String getGarage() {
        return garage;
    }

    public String getGarden() {
        return garden;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public HouseBuilder wall(String wall) {
        this.wall = wall;
        return this;
    }

    public HouseBuilder door(String door) {
        this.door = door;
        return this;
    }

    public HouseBuilder roof(String roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder window(String window) {
        this.window = window;
        return this;
    }

    public HouseBuilder garage(String garage) {
        this.garage = garage;
        return this;
    }

    public HouseBuilder garden(String garden) {
        this.garden = garden;
        return this;
    }

    public HouseBuilder swimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    public House build() {
        House house = new House();
        house.setWall(wall);
        house.setDoor(door);
        house.setRoof(roof);
        house.setWindow(window);
        house.setGarage(garage);
        house.setGarden(garden);
        house.setSwimmingPool(swimmingPool);
        return house;
    }

}
