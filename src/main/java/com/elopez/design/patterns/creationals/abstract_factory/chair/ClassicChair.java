package com.elopez.design.patterns.creationals.abstract_factory.chair;

public class ClassicChair implements Chair{
    
    @Override
    public void sitOn() {
        System.out.println("Sitting on a classic chair");
    }
}
