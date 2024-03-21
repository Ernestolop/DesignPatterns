package com.elopez.design.patterns.structurals.bridge;

import com.elopez.design.patterns.structurals.bridge.plataforms.DrawingApi;
import com.elopez.design.patterns.structurals.bridge.plataforms.OpenGLDrawing;
import com.elopez.design.patterns.structurals.bridge.shape.Circle;

public class Client {
    public static void main(String[] args) {
        DrawingApi drawingApi = new OpenGLDrawing();
        Circle circle = new Circle(1, 2, 3, drawingApi);
        circle.draw();
    }
}
