package org.example.factory;

/**
 * Fabrique concrète pour créer des cercles.
 */
public class CircleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}