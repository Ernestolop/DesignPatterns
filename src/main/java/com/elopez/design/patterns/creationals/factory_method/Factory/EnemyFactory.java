package com.elopez.design.patterns.creationals.factory_method.Factory;

import com.elopez.design.patterns.creationals.factory_method.Enemy.Enemy;

public interface EnemyFactory {

    public abstract Enemy createEnemy();
}
