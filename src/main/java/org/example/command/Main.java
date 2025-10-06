package org.example.command;

/**
 * Classe de test du pattern Command
 * Démontre le découplage entre invocateur et receveurs
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║      SYSTÈME DOMOTIQUE - PATTERN COMMAND          ║");
        System.out.println("╚═══════════════════════════════════════════════════╝\n");

        // Création de la télécommande (l'invocateur)
        RemoteControl remote = new RemoteControl();

        System.out.println("🏠 Initialisation des appareils...\n");

        // Création des appareils (les receveurs)
        Light livingRoomLight = new Light("Salon");
        Light bedroomLight = new Light("Chambre");
        Fan livingRoomFan = new Fan("Salon");
        Fan bedroomFan = new Fan("Chambre");

        // Création des commandes
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);

        FanOnCommand livingRoomFanOn = new FanOnCommand(livingRoomFan);
        FanOffCommand livingRoomFanOff = new FanOffCommand(livingRoomFan);

        FanOnCommand bedroomFanOn = new FanOnCommand(bedroomFan);
        FanOffCommand bedroomFanOff = new FanOffCommand(bedroomFan);

        // Configuration de la télécommande
        System.out.println("🔧 Configuration de la télécommande...\n");
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, bedroomLightOn, bedroomLightOff);
        remote.setCommand(2, livingRoomFanOn, livingRoomFanOff);
        remote.setCommand(3, bedroomFanOn, bedroomFanOff);

        // Affichage de l'état de la télécommande
        remote.displayStatus();

        // Test des commandes
        System.out.println("\n" + "═".repeat(50));
        System.out.println("TEST 1 : Allumage des lumières");
        System.out.println("═".repeat(50) + "\n");

        remote.onButtonPressed(0);  // Lumière salon ON
        remote.onButtonPressed(1);  // Lumière chambre ON

        System.out.println("\n" + "═".repeat(50));
        System.out.println("TEST 2 : Allumage des ventilateurs");
        System.out.println("═".repeat(50) + "\n");

        remote.onButtonPressed(2);  // Ventilateur salon ON
        remote.onButtonPressed(3);  // Ventilateur chambre ON

        System.out.println("\n" + "═".repeat(50));
        System.out.println("TEST 3 : Extinction partielle");
        System.out.println("═".repeat(50) + "\n");

        remote.offButtonPressed(0); // Lumière salon OFF
        remote.offButtonPressed(2); // Ventilateur salon OFF

        System.out.println("\n" + "═".repeat(50));
        System.out.println("TEST 4 : Fonction UNDO (annulation)");
        System.out.println("═".repeat(50) + "\n");

        System.out.println("📋 Dernière action : éteindre ventilateur salon");
        remote.undoButtonPressed();

        System.out.println("\n📋 Action précédente : éteindre lumière salon");
        remote.undoButtonPressed();

        System.out.println("\n" + "═".repeat(50));
        System.out.println("TEST 5 : Bouton non configuré");
        System.out.println("═".repeat(50) + "\n");

        remote.onButtonPressed(5);  // Bouton vide

        System.out.println("\n" + "═".repeat(50));
        System.out.println("TEST 6 : Extinction complète");
        System.out.println("═".repeat(50) + "\n");

        remote.offButtonPressed(1); // Lumière chambre OFF
        remote.offButtonPressed(3); // Ventilateur chambre OFF

        System.out.println("\n" + "═".repeat(50));
        System.out.println("✅ Démonstration terminée !");
        System.out.println("Le pattern Command permet de :");
        System.out.println("  • Découpler l'invocateur des receveurs");
        System.out.println("  • Encapsuler les actions dans des objets");
        System.out.println("  • Implémenter facilement l'annulation (undo)");
        System.out.println("  • Enregistrer l'historique des commandes");
        System.out.println("═".repeat(50));
    }
}