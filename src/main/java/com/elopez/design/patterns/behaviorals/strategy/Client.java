package com.elopez.design.patterns.behaviorals.strategy;

import com.elopez.design.patterns.behaviorals.strategy.app.Computer;
import com.elopez.design.patterns.behaviorals.strategy.app.algorithms.BubbleSort;
import com.elopez.design.patterns.behaviorals.strategy.app.algorithms.InsertionSort;

public class Client {
    public static void main(String[] args) {
        int[] numbers = { 7, 2, 5, 1, 9, 3 };

        Computer computer = new Computer();

        computer.setStrategy(new BubbleSort());
        computer.executeOrdering(numbers.clone());

        computer.setStrategy(new InsertionSort());
        computer.executeOrdering(numbers.clone());
    }
}
