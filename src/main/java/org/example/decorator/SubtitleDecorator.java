package org.example.decorator;

/**
 * Décorateur concret qui ajoute les sous-titres.
 */
public class SubtitleDecorator extends VideoDecorator {
    private String language;

    /**
     * Constructeur qui prend le composant à décorer et la langue des sous-titres.
     *
     * @param decoratedVideo le flux vidéo à décorer
     * @param language la langue des sous-titres
     */
    public SubtitleDecorator(VideoStream decoratedVideo, String language) {
        super(decoratedVideo);
        this.language = language;
    }

    @Override
    public void play() {
        decoratedVideo.play();
        addSubtitles();
    }

    /**
     * Ajoute les sous-titres.
     */
    private void addSubtitles() {
        System.out.println("+ Sous-titres activés : Langue " + language);
    }

    @Override
    public String getDescription() {
        return decoratedVideo.getDescription() + " + Sous-titres (" + language + ")";
    }

    @Override
    public double getCost() {
        return decoratedVideo.getCost() + 1.0; // Sous-titres coûtent 1€ supplémentaire
    }
}