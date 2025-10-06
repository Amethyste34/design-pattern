package org.example.facade;

/**
 * Sous-système complexe : gestion de la vidéo
 */
public class VideoPlayer {

    public void loadVideo(String filename) {
        System.out.println("[VideoPlayer] Chargement du flux vidéo depuis : " + filename);
    }

    public void decodeVideo() {
        System.out.println("[VideoPlayer] Décodage du format vidéo (H.264/VP9)...");
    }

    public void configureDisplay() {
        System.out.println("[VideoPlayer] Configuration de l'affichage (résolution, ratio)");
    }

    public void playVideo() {
        System.out.println("[VideoPlayer] Lecture du flux vidéo en cours");
    }

    public void stopVideo() {
        System.out.println("[VideoPlayer] Arrêt de la vidéo");
    }
}
