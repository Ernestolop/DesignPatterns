package com.elopez.design.patterns.factory_method;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Enemy warrior = new WarriorFactory().createEnemy();
        warrior.attack();
        Enemy mage = new MageFactory().createEnemy();
        mage.attack();
    }
}