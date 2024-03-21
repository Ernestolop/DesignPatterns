package com.elopez.design.patterns.creationals.builder;

import com.elopez.design.patterns.creationals.builder.house.House;
import com.elopez.design.patterns.creationals.builder.house.HouseBuilder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.wall("brick")
                .door("wood")
                .roof("shingles")
                .window("glass")
                .swimmingPool("inground")
                .build();
        System.out.println(house.toString());
    }
}
