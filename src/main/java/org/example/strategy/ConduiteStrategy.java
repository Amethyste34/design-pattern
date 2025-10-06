package org.example.strategy;

/**
 * Stratégie concrète : déplacement en véhicule
 */
public class ConduiteStrategy implements DeplacementStrategy {

    @Override
    public void deplacer() {
        System.out.println("🚗 Je conduis un véhicule motorisé !");
        System.out.println("   → Vitesse : rapide");
        System.out.println("   → Terrain : routes pavées");
        System.out.println("   → Carburant nécessaire");
    }
}