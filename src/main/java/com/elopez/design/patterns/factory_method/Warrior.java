package com.elopez.design.patterns.factory_method;

public class Warrior implements Enemy{
    
    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }
}
