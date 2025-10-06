package org.example.state;

/**
 * Classe de test du pattern State
 * Démontre les transitions d'état de la machine à boisson
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║        MACHINE À BOISSON - PATTERN STATE          ║");
        System.out.println("╚═══════════════════════════════════════════════════╝\n");

        // Création d'une machine avec 3 boissons en stock
        MachineBoisson machine = new MachineBoisson(3);

        machine.afficherEtat();

        // Scénario 1 : Utilisation normale
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 1 : Achat normal d'une boisson");
        System.out.println("═".repeat(50) + "\n");

        machine.insererPiece();
        machine.selectionnerBoisson();

        pause(1000);

        // Scénario 2 : Tentative d'actions invalides
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 2 : Actions invalides");
        System.out.println("═".repeat(50) + "\n");

        machine.selectionnerBoisson(); // Sans pièce
        machine.distribuerBoisson();   // Sans pièce

        pause(1000);

        // Scénario 3 : Annulation (éjection de pièce)
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 3 : Annulation avec éjection de pièce");
        System.out.println("═".repeat(50) + "\n");

        machine.insererPiece();
        machine.ejecterPiece();

        pause(1000);

        // Scénario 4 : Achats successifs jusqu'à rupture
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 4 : Achats jusqu'à rupture de stock");
        System.out.println("═".repeat(50) + "\n");

        machine.afficherEtat();

        // Premier achat
        System.out.println("\n--- Achat #1 ---");
        machine.insererPiece();
        machine.selectionnerBoisson();
        pause(500);

        // Deuxième achat
        System.out.println("\n--- Achat #2 ---");
        machine.insererPiece();
        machine.selectionnerBoisson();
        pause(500);

        // Troisième achat (rupture après)
        System.out.println("\n--- Achat #3 ---");
        machine.insererPiece();
        machine.selectionnerBoisson();
        pause(1000);

        machine.afficherEtat();

        // Scénario 5 : Tentative d'achat en rupture
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 5 : Tentative d'utilisation en rupture");
        System.out.println("═".repeat(50) + "\n");

        machine.insererPiece();
        machine.selectionnerBoisson();

        pause(1000);

        // Scénario 6 : Remplissage du stock
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 6 : Remplissage du stock");
        System.out.println("═".repeat(50) + "\n");

        machine.remplirStock();
        machine.afficherEtat();

        pause(1000);

        // Scénario 7 : Utilisation après remplissage
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 7 : Nouvel achat après remplissage");
        System.out.println("═".repeat(50) + "\n");

        machine.insererPiece();
        machine.selectionnerBoisson();

        machine.afficherEtat();

        System.out.println("\n" + "═".repeat(50));
        System.out.println("✅ Démonstration terminée !");
        System.out.println("Le pattern State permet de :");
        System.out.println("  • Encapsuler les comportements liés à chaque état");
        System.out.println("  • Éviter les conditions if/switch complexes");
        System.out.println("  • Changer d'état dynamiquement");
        System.out.println("  • Ajouter de nouveaux états facilement");
        System.out.println("═".repeat(50));
    }

    /**
     * Méthode utilitaire pour ajouter une pause
     */
    private static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}