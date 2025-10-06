package org.example.strategy;

/**
 * Stratégie concrète : déplacement en volant
 */
public class VolStrategy implements DeplacementStrategy {

    @Override
    public void deplacer() {
        System.out.println("🦸 Je vole dans les airs comme un super-héros !");
        System.out.println("   → Vitesse : très rapide");
        System.out.println("   → Terrain : aucune limite");
        System.out.println("   → Pas d'obstacles au sol");
    }
}