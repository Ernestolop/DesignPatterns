package com.elopez.design.patterns.behaviorals.visitor.app.interfaces;

import com.elopez.design.patterns.behaviorals.visitor.app.Square;
import com.elopez.design.patterns.behaviorals.visitor.app.Circle;

public interface Visitor {
    void visitCircle(Circle circle);

    void visitSquare(Square square);
}
