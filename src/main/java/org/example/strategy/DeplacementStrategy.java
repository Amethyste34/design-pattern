package org.example.strategy;

/**
 * Interface Strategy : définit le contrat pour les différents comportements de déplacement
 */
public interface DeplacementStrategy {

    /**
     * Méthode de déplacement à implémenter par chaque stratégie concrète
     */
    void deplacer();
}