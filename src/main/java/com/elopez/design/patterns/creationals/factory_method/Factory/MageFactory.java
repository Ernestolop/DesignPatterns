package com.elopez.design.patterns.creationals.factory_method.Factory;

import com.elopez.design.patterns.creationals.factory_method.Enemy.Enemy;
import com.elopez.design.patterns.creationals.factory_method.Enemy.Mage;

public class MageFactory implements EnemyFactory{
    
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }
}
