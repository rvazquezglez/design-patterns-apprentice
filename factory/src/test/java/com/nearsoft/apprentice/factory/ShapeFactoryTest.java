package com.nearsoft.apprentice.factory;

import org.junit.Test;

public class ShapeFactoryTest {
    @Test
    public void testGetShape() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape firstShape = shapeFactory.getShape("CIRCLE");
        firstShape.draw();

        Shape secondShape = shapeFactory.getShape("RECTANGLE");
        secondShape.draw();

    }

    @Test
    public void testGetShapeWithLambdas() {
        ShapeFactoryWithLambdas shapeFactory = new ShapeFactoryWithLambdas();

        Shape firstShape = shapeFactory.getShape("CIRCLE");
        firstShape.draw();

        Shape secondShape = shapeFactory.getShape("RECTANGLE");
        secondShape.draw();

    }
}