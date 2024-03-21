package com.elopez.design.patterns.creationals.factory;

public class Warrior implements Enemy{
    
    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }
}
