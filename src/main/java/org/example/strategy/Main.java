package org.example.strategy;

/**
 * Classe de test du pattern Strategy
 * Démontre le changement dynamique de comportement
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║        JEU DE RÔLE - PATTERN STRATEGY             ║");
        System.out.println("╚═══════════════════════════════════════════════════╝\n");

        // Création des stratégies
        DeplacementStrategy marche = new MarcheStrategy();
        DeplacementStrategy conduite = new ConduiteStrategy();
        DeplacementStrategy vol = new VolStrategy();

        System.out.println("🎮 Création des personnages...\n");

        // Création de personnages avec différentes stratégies initiales
        Personnage soldat = new Personnage("Ryan", "Soldat", marche);
        Personnage pilote = new Personnage("Elena", "Pilote", conduite);
        Personnage superheros = new Personnage("Thunder", "Super-héros", vol);

        // Présentation des personnages
        soldat.sePresenter();
        pilote.sePresenter();
        superheros.sePresenter();

        System.out.println("\n" + "═".repeat(50));
        System.out.println("PHASE 1 : Déplacements avec stratégies initiales");
        System.out.println("═".repeat(50));

        soldat.seDeplacer();
        pilote.seDeplacer();
        superheros.seDeplacer();

        // Changement dynamique de stratégies
        System.out.println("\n" + "═".repeat(50));
        System.out.println("PHASE 2 : Changement dynamique de stratégies");
        System.out.println("═".repeat(50) + "\n");

        System.out.println("📢 Le soldat trouve un véhicule abandonné...");
        soldat.setDeplacementStrategy(conduite);
        soldat.seDeplacer();

        System.out.println("\n📢 Le super-héros décide de marcher...");
        superheros.setDeplacementStrategy(marche);
        superheros.seDeplacer();

        System.out.println("\n📢 Le pilote obtient un jetpack expérimental...");
        pilote.setDeplacementStrategy(vol);
        pilote.seDeplacer();

        // Démonstration de la flexibilité
        System.out.println("\n" + "═".repeat(50));
        System.out.println("PHASE 3 : Nouvelle mission - tout le monde vole !");
        System.out.println("═".repeat(50) + "\n");

        System.out.println("🚁 Distribution de jetpacks à toute l'équipe...\n");

        soldat.setDeplacementStrategy(vol);
        superheros.setDeplacementStrategy(vol);
        // Le pilote vole déjà

        System.out.println("\n🎯 L'équipe se déplace vers la zone de mission :\n");
        soldat.seDeplacer();
        pilote.seDeplacer();
        superheros.seDeplacer();

        System.out.println("\n" + "═".repeat(50));
        System.out.println("✅ Mission terminée !");
        System.out.println("Le pattern Strategy permet de changer le comportement");
        System.out.println("des personnages à l'exécution sans modifier leur code.");
        System.out.println("═".repeat(50));
    }
}