package org.example.factory;

/**
 * Classe concrète représentant un cercle.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Dessin d'un cercle");
    }
}