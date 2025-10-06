package org.example.strategy;

/**
 * Stratégie concrète : déplacement à pied
 */
public class MarcheStrategy implements DeplacementStrategy {

    @Override
    public void deplacer() {
        System.out.println("🚶 Je marche tranquillement à pied.");
        System.out.println("   → Vitesse : lente");
        System.out.println("   → Terrain : routes et chemins");
    }
}