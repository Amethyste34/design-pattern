package org.example.factory;

/**
 * Classe concrète représentant un rectangle.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Dessin d'un rectangle");
    }
}