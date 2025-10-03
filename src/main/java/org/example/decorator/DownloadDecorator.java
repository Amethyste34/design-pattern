package org.example.decorator;

/**
 * Décorateur concret qui ajoute la possibilité de télécharger la vidéo.
 */
public class DownloadDecorator extends VideoDecorator {

    /**
     * Constructeur qui prend le composant à décorer.
     *
     * @param decoratedVideo le flux vidéo à décorer
     */
    public DownloadDecorator(VideoStream decoratedVideo) {
        super(decoratedVideo);
    }

    @Override
    public void play() {
        decoratedVideo.play();
        addDownloadOption();
    }

    /**
     * Ajoute l'option de téléchargement.
     */
    private void addDownloadOption() {
        System.out.println("+ Option téléchargement activée : Vidéo disponible hors ligne");
    }

    /**
     * Méthode supplémentaire spécifique au téléchargement.
     */
    public void download() {
        System.out.println("Téléchargement de la vidéo en cours...");
        System.out.println("Téléchargement terminé ! Vidéo sauvegardée localement.");
    }

    @Override
    public String getDescription() {
        return decoratedVideo.getDescription() + " + Téléchargement";
    }

    @Override
    public double getCost() {
        return decoratedVideo.getCost() + 2.0; // Téléchargement coûte 2€ supplémentaires
    }
}