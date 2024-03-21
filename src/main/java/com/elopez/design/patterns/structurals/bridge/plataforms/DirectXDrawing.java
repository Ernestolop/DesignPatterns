package com.elopez.design.patterns.structurals.bridge.plataforms;

public class DirectXDrawing implements DrawingApi{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle with DirectX at " + x + ":" + y + " with radius " + radius);
    }
}
