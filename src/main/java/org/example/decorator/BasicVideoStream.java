package org.example.decorator;

/**
 * Implémentation de base d'un flux vidéo simple.
 * C'est le composant concret de base qui sera décoré.
 */
public class BasicVideoStream implements VideoStream {
    private String title;

    /**
     * Constructeur avec titre de la vidéo.
     *
     * @param title le titre de la vidéo
     */
    public BasicVideoStream(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Lecture de la vidéo : " + title);
        System.out.println("Qualité : Standard (480p)");
    }

    @Override
    public String getDescription() {
        return "Vidéo basique : " + title;
    }

    @Override
    public double getCost() {
        return 5.0; // Coût de base : 5€
    }
}