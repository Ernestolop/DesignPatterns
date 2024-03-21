package com.elopez.design.patterns.factory;

public class Mage implements Enemy {
    
    @Override
    public void attack() {
        System.out.println("Mage attacks!");
    }
}
