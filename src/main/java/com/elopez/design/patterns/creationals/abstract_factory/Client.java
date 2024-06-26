package com.elopez.design.patterns.creationals.abstract_factory;

import com.elopez.design.patterns.creationals.abstract_factory.chair.Chair;
import com.elopez.design.patterns.creationals.abstract_factory.couch.Couch;
import com.elopez.design.patterns.creationals.abstract_factory.factory.ClassicFactory;
import com.elopez.design.patterns.creationals.abstract_factory.factory.FurnitureFactory;
import com.elopez.design.patterns.creationals.abstract_factory.factory.ModernFactory;
import com.elopez.design.patterns.creationals.abstract_factory.table.Table;

public class Client {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFactory();
        Chair chair = furnitureFactory.createChair();
        Couch couch = furnitureFactory.createCouch();
        Table table = furnitureFactory.createTable();
        chair.sitOn();
        couch.layOn();
        table.eatOn();

        furnitureFactory = new ClassicFactory();
        chair = furnitureFactory.createChair();
        couch = furnitureFactory.createCouch();
        table = furnitureFactory.createTable();
        chair.sitOn();
        couch.layOn();
        table.eatOn();
    }
}
