package com.elopez.design.patterns.factory;

public class EnemyFactory {

    public Enemy createEnemy(String type) {
        switch (type) {
            case "warrior":
                return new Warrior();
            case "mage":
                return new Mage();
            default:
                return null;
        }
    }

}
