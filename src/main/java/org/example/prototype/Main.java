package org.example.prototype;

/**
 * Classe Main pour tester l'implémentation du pattern Prototype.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Prototype ===\n");

        // Création d'un guerrier prototype avec configuration complète
        System.out.println("1. Création du PROTOTYPE de guerrier");
        System.out.println("--------------------------------------------------");
        Warrior prototypeWarrior = new Warrior(
                "Guerrier Prototype",
                100,
                "Épée longue",
                5,
                "Armure lourde"
        );
        prototypeWarrior.displayInfo();
        System.out.println();
        prototypeWarrior.attack();
        System.out.println();
        prototypeWarrior.defend();

        System.out.println("\n==================================================\n");

        // Clonage du prototype pour créer un premier guerrier
        System.out.println("2. Clonage pour créer le Guerrier n°1");
        System.out.println("--------------------------------------------------");
        Warrior warrior1 = prototypeWarrior.clone();
        warrior1.setName("Aragorn");
        warrior1.displayInfo();
        System.out.println();
        warrior1.attack();

        System.out.println("\n--------------------------------------------------\n");

        // Clonage du prototype pour créer un deuxième guerrier
        System.out.println("3. Clonage pour créer le Guerrier n°2");
        System.out.println("--------------------------------------------------");
        Warrior warrior2 = prototypeWarrior.clone();
        warrior2.setName("Boromir");
        warrior2.setWeapon("Hache de guerre");
        warrior2.setLevel(7);
        warrior2.displayInfo();
        System.out.println();
        warrior2.attack();

        System.out.println("\n--------------------------------------------------\n");

        // Clonage du prototype pour créer un troisième guerrier
        System.out.println("4. Clonage pour créer le Guerrier n°3");
        System.out.println("--------------------------------------------------");
        Warrior warrior3 = prototypeWarrior.clone();
        warrior3.setName("Gimli");
        warrior3.setWeapon("Double hache");
        warrior3.setHealth(120);
        warrior3.setArmorType("Armure de mithril");
        warrior3.displayInfo();
        System.out.println();
        warrior3.defend();

        System.out.println("\n==================================================\n");

        // Vérification que les clones sont des objets distincts
        System.out.println("5. Vérification de l'indépendance des clones");
        System.out.println("--------------------------------------------------");
        System.out.println("Prototype : " + prototypeWarrior.getName() +
                " (Niveau " + prototypeWarrior.getLevel() + ")");
        System.out.println("Guerrier 1 : " + warrior1.getName() +
                " (Niveau " + warrior1.getLevel() + ")");
        System.out.println("Guerrier 2 : " + warrior2.getName() +
                " (Niveau " + warrior2.getLevel() + ")");
        System.out.println("Guerrier 3 : " + warrior3.getName() +
                " (Niveau " + warrior3.getLevel() + ")");

        System.out.println("\nComparaison des références :");
        System.out.println("warrior1 == prototypeWarrior : " + (warrior1 == prototypeWarrior));
        System.out.println("warrior2 == prototypeWarrior : " + (warrior2 == prototypeWarrior));
        System.out.println("warrior1 == warrior2 : " + (warrior1 == warrior2));

        System.out.println("\n==================================================");
        System.out.println("✓ Le pattern Prototype permet de :");
        System.out.println("  - Créer de nouveaux objets par clonage");
        System.out.println("  - Éviter la configuration répétitive");
        System.out.println("  - Améliorer les performances de création");
        System.out.println("  - Personnaliser facilement les clones");
    }
}