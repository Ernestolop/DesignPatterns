package com.elopez.design.patterns.creationals.prototype;

import com.elopez.design.patterns.creationals.prototype.warrior.Warrior;

public class Client {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.setName("Warrior");
        warrior.setWeapon("Sword");
        Warrior anotherWarrior = warrior.clone();
        warrior.setName("Another Warrior");
        System.out.println(warrior);
        System.out.println(anotherWarrior);      
    }
}
