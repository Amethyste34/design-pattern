package org.example.decorator;

/**
 * Interface commune pour tous les flux vidéo.
 * Définit les opérations de base qu'une vidéo peut effectuer.
 */
public interface VideoStream {
    /**
     * Lance la lecture de la vidéo.
     */
    void play();

    /**
     * Retourne la description de la vidéo et de ses options.
     *
     * @return description de la vidéo
     */
    String getDescription();

    /**
     * Retourne le coût de la vidéo avec toutes ses options.
     *
     * @return le coût total
     */
    double getCost();
}