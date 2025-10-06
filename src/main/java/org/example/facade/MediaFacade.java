package org.example.facade;

/**
 * Pattern Facade : interface simplifiée pour le sous-système multimédia
 * Encapsule la complexité des opérations audio/vidéo
 */
public class MediaFacade {

    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;

    public MediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    /**
     * Méthode simplifiée pour lire un média
     * Le client n'a pas besoin de connaître les détails internes
     */
    public void playMedia(String filename) {
        System.out.println("\n=== Démarrage de la lecture : " + filename + " ===\n");

        // Orchestration automatique des opérations complexes
        audioPlayer.loadAudio(filename);
        videoPlayer.loadVideo(filename);

        audioPlayer.decodeAudio();
        videoPlayer.decodeVideo();

        audioPlayer.configureAudioOutput();
        videoPlayer.configureDisplay();

        // Synchronisation audio/vidéo
        System.out.println("[MediaFacade] Synchronisation audio-vidéo...");

        audioPlayer.playAudio();
        videoPlayer.playVideo();

        System.out.println("\n=== Lecture en cours ===\n");
    }

    /**
     * Méthode simplifiée pour arrêter la lecture
     */
    public void stopMedia() {
        System.out.println("\n=== Arrêt de la lecture ===\n");
        audioPlayer.stopAudio();
        videoPlayer.stopVideo();
        System.out.println("[MediaFacade] Média arrêté avec succès\n");
    }
}
