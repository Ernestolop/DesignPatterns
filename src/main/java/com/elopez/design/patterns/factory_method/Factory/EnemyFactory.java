package com.elopez.design.patterns.factory_method.Factory;

import com.elopez.design.patterns.factory_method.Enemy.Enemy;

public interface EnemyFactory {

    public abstract Enemy createEnemy();
}
