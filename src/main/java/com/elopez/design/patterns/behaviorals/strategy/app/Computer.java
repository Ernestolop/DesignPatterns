package com.elopez.design.patterns.behaviorals.strategy.app;

import com.elopez.design.patterns.behaviorals.strategy.app.algorithms.OrderingStrategy;

public class Computer {
    private OrderingStrategy strategy;

    public void setStrategy(OrderingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeOrdering(int[] numbers) {
        strategy.order(numbers);
    }
}
