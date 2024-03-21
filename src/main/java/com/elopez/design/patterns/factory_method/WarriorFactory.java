package com.elopez.design.patterns.factory_method;

public class WarriorFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
    
}
