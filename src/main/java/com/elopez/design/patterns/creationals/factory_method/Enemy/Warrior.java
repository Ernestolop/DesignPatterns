package com.elopez.design.patterns.creationals.factory_method.Enemy;

public class Warrior implements Enemy{
    
    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }
}
