package com.elopez.design.patterns.factory_method.Enemy;

public class Mage implements Enemy {
    
    @Override
    public void attack() {
        System.out.println("Mage attacks!");
    }
}
