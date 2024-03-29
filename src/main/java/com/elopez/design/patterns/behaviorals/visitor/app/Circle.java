package com.elopez.design.patterns.behaviorals.visitor.app;

import com.elopez.design.patterns.behaviorals.visitor.app.interfaces.Shape;
import com.elopez.design.patterns.behaviorals.visitor.app.interfaces.Visitor;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
