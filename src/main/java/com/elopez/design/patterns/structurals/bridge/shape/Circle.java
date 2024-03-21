package com.elopez.design.patterns.structurals.bridge.shape;

import com.elopez.design.patterns.structurals.bridge.plataforms.DrawingApi;

public class Circle extends Shape{
    private double x, y, radius;

    public Circle(double x, double y, double radius, DrawingApi drawingApi) {
        super(drawingApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingApi.drawCircle(x, y, radius);
    }
}
