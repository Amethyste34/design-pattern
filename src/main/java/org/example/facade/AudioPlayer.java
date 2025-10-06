package org.example.facade;

/**
 * Sous-système complexe : gestion de l'audio
 */
public class AudioPlayer {

    public void loadAudio(String filename) {
        System.out.println("[AudioPlayer] Chargement du flux audio depuis : " + filename);
    }

    public void decodeAudio() {
        System.out.println("[AudioPlayer] Décodage du format audio (MP3/AAC)...");
    }

    public void configureAudioOutput() {
        System.out.println("[AudioPlayer] Configuration de la sortie audio (haut-parleurs)");
    }

    public void playAudio() {
        System.out.println("[AudioPlayer] Lecture du flux audio en cours");
    }

    public void stopAudio() {
        System.out.println("[AudioPlayer] Arrêt de l'audio");
    }
}