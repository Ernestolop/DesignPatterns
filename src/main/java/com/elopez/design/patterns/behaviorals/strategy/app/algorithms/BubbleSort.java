package com.elopez.design.patterns.behaviorals.strategy.app.algorithms;

import java.util.Arrays;

public class BubbleSort implements OrderingStrategy {
    @Override
    public void order(int[] numbers) {
        System.out.println("Sorting using the bubble sort algorithm.");
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
