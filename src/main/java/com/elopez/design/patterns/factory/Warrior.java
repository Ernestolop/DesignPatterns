package com.elopez.design.patterns.factory;

public class Warrior implements Enemy{
    
    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }
}
