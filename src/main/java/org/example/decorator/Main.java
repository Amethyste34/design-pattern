package org.example.decorator;

/**
 * Classe Main pour tester l'implémentation du pattern Decorator.
 */
public class Main {

    /**
     * Méthode utilitaire pour afficher les informations d'une vidéo.
     *
     * @param video le flux vidéo
     */
    private static void displayVideoInfo(VideoStream video) {
        System.out.println("Description : " + video.getDescription());
        System.out.println("Coût total : " + video.getCost() + " €");
        System.out.println("--------------------------------------------------");
        video.play();
        System.out.println("==================================================\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Decorator ===\n");

        // 1. Vidéo basique sans options
        System.out.println("1. Vidéo basique (sans options)");
        System.out.println("==================================================");
        VideoStream basicVideo = new BasicVideoStream("Le Seigneur des Anneaux");
        displayVideoInfo(basicVideo);

        // 2. Vidéo avec HD uniquement
        System.out.println("2. Vidéo avec option HD");
        System.out.println("==================================================");
        VideoStream hdVideo = new HDDecorator(
                new BasicVideoStream("Dexter")
        );
        displayVideoInfo(hdVideo);

        // 3. Vidéo avec sous-titres uniquement
        System.out.println("3. Vidéo avec sous-titres");
        System.out.println("==================================================");
        VideoStream subtitledVideo = new SubtitleDecorator(
                new BasicVideoStream("Game of Thrones"),
                "Français"
        );
        displayVideoInfo(subtitledVideo);

        // 4. Vidéo avec HD + Sous-titres
        System.out.println("4. Vidéo avec HD + Sous-titres");
        System.out.println("==================================================");
        VideoStream hdSubtitledVideo = new SubtitleDecorator(
                new HDDecorator(
                        new BasicVideoStream("Inception")
                ),
                "Anglais"
        );
        displayVideoInfo(hdSubtitledVideo);

        // 5. Vidéo avec toutes les options
        System.out.println("5. Vidéo PREMIUM (HD + Sous-titres + Téléchargement)");
        System.out.println("==================================================");
        VideoStream premiumVideo = new DownloadDecorator(
                new SubtitleDecorator(
                        new HDDecorator(
                                new BasicVideoStream("Interstellar")
                        ),
                        "Espagnol"
                )
        );
        displayVideoInfo(premiumVideo);

        // Démonstration de la méthode download() spécifique
        System.out.println("Utilisation de la fonctionnalité de téléchargement :");
        System.out.println("--------------------------------------------------");
        if (premiumVideo instanceof DownloadDecorator) {
            ((DownloadDecorator) premiumVideo).download();
        }

        System.out.println("\n==================================================\n");

        // 6. Autre combinaison : Téléchargement + Sous-titres (sans HD)
        System.out.println("6. Vidéo avec Téléchargement + Sous-titres (sans HD)");
        System.out.println("==================================================");
        VideoStream downloadSubtitledVideo = new DownloadDecorator(
                new SubtitleDecorator(
                        new BasicVideoStream("Avatar"),
                        "Allemand"
                )
        );
        displayVideoInfo(downloadSubtitledVideo);

        // Récapitulatif des avantages
          System.out.println("==================================================");
          System.out.println("✓ Le pattern Decorator permet de :");
          System.out.println("  - Ajouter des fonctionnalités dynamiquement");
          System.out.println("  - Combiner librement les options");
          System.out.println("  - Éviter l'explosion de sous-classes");
          System.out.println("  - Respecter le principe Open/Closed");
          System.out.println("\nNombre de combinaisons possibles :");
          System.out.println("  Sans Decorator : 8 sous-classes nécessaires");
          System.out.println("  Avec Decorator : 3 décorateurs réutilisables");
          System.out.println("==================================================");
    }
}