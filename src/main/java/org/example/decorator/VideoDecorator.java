package org.example.decorator;

/**
 * Classe abstraite Decorator qui implémente VideoStream.
 * Sert de base pour tous les décorateurs concrets.
 *
 * Cette classe contient une référence au composant décoré
 * et délègue les appels à ce composant.
 */
public abstract class VideoDecorator implements VideoStream {
    protected VideoStream decoratedVideo;

    /**
     * Constructeur qui prend le composant à décorer.
     *
     * @param decoratedVideo le flux vidéo à décorer
     */
    public VideoDecorator(VideoStream decoratedVideo) {
        this.decoratedVideo = decoratedVideo;
    }

    @Override
    public void play() {
        decoratedVideo.play();
    }

    @Override
    public String getDescription() {
        return decoratedVideo.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedVideo.getCost();
    }
}