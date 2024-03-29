package com.elopez.design.patterns.behaviorals.visitor;

import com.elopez.design.patterns.behaviorals.visitor.app.AreaCalculator;
import com.elopez.design.patterns.behaviorals.visitor.app.Circle;
import com.elopez.design.patterns.behaviorals.visitor.app.Square;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        AreaCalculator areaCalculator = new AreaCalculator();

        circle.accept(areaCalculator);
        square.accept(areaCalculator);

        double totalArea = areaCalculator.getTotalArea();
        System.out.println("El área total de todas las formas geométricas es: " + totalArea);
    }
}
