package com.elopez.design.patterns.structurals.bridge.shape;

import com.elopez.design.patterns.structurals.bridge.plataforms.DrawingApi;

public abstract class Shape {
    protected DrawingApi drawingApi;

    public Shape(DrawingApi drawingApi) {
        this.drawingApi = drawingApi;
    }

    public abstract void draw();
}
