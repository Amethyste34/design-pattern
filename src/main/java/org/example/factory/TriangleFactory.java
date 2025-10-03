package org.example.factory;

/**
 * Fabrique concrète pour créer des triangles.
 */
public class TriangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}