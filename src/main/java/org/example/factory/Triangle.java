package org.example.factory;

/**
 * Classe concrète représentant un triangle.
 */
public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Dessin d'un triangle");
    }
}