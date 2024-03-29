package com.elopez.design.patterns.behaviorals.visitor.app;

import com.elopez.design.patterns.behaviorals.visitor.app.interfaces.Visitor;

public class AreaCalculator implements Visitor {
    private double totalArea;

    public double getTotalArea() {
        return totalArea;
    }

    @Override
    public void visitCircle(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        totalArea += area;
    }

    @Override
    public void visitSquare(Square square) {
        double area = square.getSide() * square.getSide();
        totalArea += area;
    }
}
