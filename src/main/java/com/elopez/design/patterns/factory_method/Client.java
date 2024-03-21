package com.elopez.design.patterns.factory_method;

import com.elopez.design.patterns.factory_method.Enemy.Enemy;
import com.elopez.design.patterns.factory_method.Factory.MageFactory;
import com.elopez.design.patterns.factory_method.Factory.WarriorFactory;

public class Client {
    public static void main(String[] args) {
        Enemy warrior = new WarriorFactory().createEnemy();
        warrior.attack();
        Enemy mage = new MageFactory().createEnemy();
        mage.attack();
    }
}