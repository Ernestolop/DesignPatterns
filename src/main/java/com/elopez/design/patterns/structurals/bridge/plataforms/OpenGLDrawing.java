package com.elopez.design.patterns.structurals.bridge.plataforms;

public class OpenGLDrawing implements DrawingApi{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle with OpenGL at " + x + ":" + y + " with radius " + radius);
    }
}
