package org.example.decorator;

/**
 * Décorateur concret qui ajoute la fonctionnalité HD (Haute Définition).
 */
public class HDDecorator extends VideoDecorator {

    /**
     * Constructeur qui prend le composant à décorer.
     *
     * @param decoratedVideo le flux vidéo à décorer
     */
    public HDDecorator(VideoStream decoratedVideo) {
        super(decoratedVideo);
    }

    @Override
    public void play() {
        decoratedVideo.play();
        addHDFeature();
    }

    /**
     * Ajoute la fonctionnalité HD.
     */
    private void addHDFeature() {
        System.out.println("+ Option HD activée : Qualité améliorée à 1080p");
    }

    @Override
    public String getDescription() {
        return decoratedVideo.getDescription() + " + HD (1080p)";
    }

    @Override
    public double getCost() {
        return decoratedVideo.getCost() + 3.0; // HD coûte 3€ supplémentaires
    }
}