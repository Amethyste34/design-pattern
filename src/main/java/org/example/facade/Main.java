package org.example.facade;

/**
 * Classe de test du pattern Facade
 * Démontre la simplification apportée par la façade
 */
public class Main {

    public static void main(String[] args) {

        // Création de la façade
        MediaFacade mediaFacade = new MediaFacade();

        // Lecture simplifiée : un seul appel au lieu de multiples appels complexes
        mediaFacade.playMedia("film_vacances.mp4");

        // Simulation d'attente
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Arrêt simplifié
        mediaFacade.stopMedia();

        System.out.println("--------------------------------------\n");

        // Lecture d'un autre fichier
        mediaFacade.playMedia("concert_live.mkv");
    }
}