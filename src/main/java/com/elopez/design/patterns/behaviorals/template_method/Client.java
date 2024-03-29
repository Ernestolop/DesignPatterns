package com.elopez.design.patterns.behaviorals.template_method;

import com.elopez.design.patterns.behaviorals.template_method.app.HouseBuilder;
import com.elopez.design.patterns.behaviorals.template_method.app.ModernHouseBuilder;
import com.elopez.design.patterns.behaviorals.template_method.app.TraditionalHouseBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println("Building a modern house:");
        HouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        modernHouseBuilder.buildHouse();

        System.out.println("Building a traditional house:");
        HouseBuilder traditionalHouseBuilder = new TraditionalHouseBuilder();
        traditionalHouseBuilder.buildHouse();
    }
}
