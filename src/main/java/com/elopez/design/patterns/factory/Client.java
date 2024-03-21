package com.elopez.design.patterns.factory;

public class Client {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy enemy = enemyFactory.createEnemy("warrior");
        enemy.attack();
        enemy = enemyFactory.createEnemy("mage");
        enemy.attack();
    }
}
