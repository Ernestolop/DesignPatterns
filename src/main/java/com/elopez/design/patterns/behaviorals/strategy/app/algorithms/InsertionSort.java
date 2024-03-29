package com.elopez.design.patterns.behaviorals.strategy.app.algorithms;

import java.util.Arrays;

public class InsertionSort implements OrderingStrategy {
    @Override
    public void order(int[] numbers) {
        System.out.println("Sorting using the insertion sort algorithm.");
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
