package com.elopez.design.patterns.behaviorals.visitor.app;

import com.elopez.design.patterns.behaviorals.visitor.app.interfaces.Shape;
import com.elopez.design.patterns.behaviorals.visitor.app.interfaces.Visitor;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSquare(this);
    }
}
