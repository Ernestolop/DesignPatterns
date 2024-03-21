package com.elopez.design.patterns.factory_method.Factory;

import com.elopez.design.patterns.factory_method.Enemy.Enemy;
import com.elopez.design.patterns.factory_method.Enemy.Warrior;

public class WarriorFactory implements EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
    
}
