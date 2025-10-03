package org.example.factory;

/**
 * Fabrique concrète pour créer des rectangles.
 */
public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}