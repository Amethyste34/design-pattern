package org.example.abstractfactory;

/**
 * Classe Main pour tester l'implémentation du pattern Abstract Factory.
 *
 * Cette classe simule une application GUI qui peut fonctionner
 * sur différentes plateformes sans modifier le code client.
 */
public class Main {

    /**
     * Classe Application qui utilise la fabrique abstraite.
     * Le code client ne dépend que des interfaces, pas des implémentations concrètes.
     */
    static class Application {
        private Button button;
        private Menu menu;

        /**
         * Constructeur qui reçoit une fabrique abstraite.
         *
         * @param factory la fabrique à utiliser pour créer les composants
         */
        public Application(GUIFactory factory) {
            button = factory.createButton();
            menu = factory.createMenu();
        }

        /**
         * Méthode qui utilise les composants GUI créés par la fabrique.
         */
        public void render() {
            button.paint();
            menu.display();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Abstract Factory ===\n");

        // Simulation : détection du système d'exploitation
        String os = "Mac"; // Changez cette valeur pour tester : "Windows" ou "Mac"

        System.out.println("Système d'exploitation détecté : " + os);
        System.out.println();

        // Sélection de la fabrique appropriée en fonction du système
        GUIFactory factory;

        if (os.equals("Windows")) {
            factory = new WindowsFactory();
            System.out.println("Utilisation de la fabrique Windows\n");
        } else {
            factory = new MacFactory();
            System.out.println("Utilisation de la fabrique Mac\n");
        }

        // Création de l'application avec la fabrique sélectionnée
        Application app = new Application(factory);

        System.out.println("Rendu de l'interface graphique :");
        System.out.println("--------------------------------------------------");
        app.render();

        System.out.println("\n==================================================\n");

        // Test avec les deux systèmes
        System.out.println("=== Test avec Windows ===\n");
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.render();

        System.out.println("\n--------------------------------------------------\n");

        System.out.println("=== Test avec MacOS ===\n");
        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.render();

        System.out.println("\n==================================================");
        System.out.println("✓ Le pattern Abstract Factory permet de changer");
        System.out.println("  de plateforme sans modifier le code client !");
        System.out.println("✓ Les familles de produits restent cohérentes !");
    }
}