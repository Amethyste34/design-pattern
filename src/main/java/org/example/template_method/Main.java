package org.example.template_method;

/**
 * Classe de test du pattern Template Method
 * Démontre comment le squelette de l'algorithme est partagé
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║    PRÉPARATION DE BOISSONS - TEMPLATE METHOD      ║");
        System.out.println("╚═══════════════════════════════════════════════════╝");

        // Scénario 1 : Thé avec citron
        System.out.println("\n" + "═".repeat(50));
        System.out.println("SCÉNARIO 1 : Thé avec citron");
        System.out.println("═".repeat(50));

        BoissonChaud the = new The(true);
        the.preparerRecette();

        pause(1000);

        // Scénario 2 : Thé nature (sans citron)
        System.out.println("═".repeat(50));
        System.out.println("SCÉNARIO 2 : Thé nature");
        System.out.println("═".repeat(50));

        BoissonChaud theNature = new The(false);
        theNature.preparerRecette();

        pause(1000);

        // Scénario 3 : Café avec sucre et lait
        System.out.println("═".repeat(50));
        System.out.println("SCÉNARIO 3 : Café avec sucre et lait");
        System.out.println("═".repeat(50));

        BoissonChaud cafe = new Cafe(true, true);
        cafe.preparerRecette();

        pause(1000);

        // Scénario 4 : Café noir (sans rien)
        System.out.println("═".repeat(50));
        System.out.println("SCÉNARIO 4 : Café noir");
        System.out.println("═".repeat(50));

        BoissonChaud cafeNoir = new Cafe(false, false);
        cafeNoir.preparerRecette();

        pause(1000);

        // Scénario 5 : Café avec seulement du lait
        System.out.println("═".repeat(50));
        System.out.println("SCÉNARIO 5 : Café au lait (sans sucre)");
        System.out.println("═".repeat(50));

        BoissonChaud cafeAuLait = new Cafe(false, true);
        cafeAuLait.preparerRecette();

        // Résumé
        /*
        System.out.println("═".repeat(50));
        System.out.println("Démonstration terminée !");
        System.out.println("═".repeat(50));
        System.out.println("\nLe pattern Template Method permet de :");
        System.out.println("  • Définir le squelette d'un algorithme dans une classe mère");
        System.out.println("  • Laisser les sous-classes redéfinir certaines étapes");
        System.out.println("  • Éviter la duplication de code");
        System.out.println("  • Garantir que la séquence d'étapes reste cohérente");
        System.out.println("  • Utiliser des 'hooks' pour personnaliser le comportement");

        System.out.println("\nStructure observée :");
        System.out.println("  1. faireBouillirEau()    → commune (dans la classe mère)");
        System.out.println("  2. preparer()            → spécifique (redéfinie dans chaque sous-classe)");
        System.out.println("  3. verserDansTasse()     → commune (dans la classe mère)");
        System.out.println("  4. ajouterIngredients()  → spécifique + contrôlée par un hook");

        System.out.println("\n" + "═".repeat(50));
        */
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