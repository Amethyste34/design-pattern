package org.example.adapter;

/**
 * Classe Main pour tester l'implémentation du pattern Adapter.
 */
public class Main {

    /**
     * Méthode du client qui utilise l'interface IDataReader.
     * Cette méthode ne connaît pas l'existence de LegacyLibrary.
     *
     * @param reader un objet implémentant IDataReader
     */
    public static void processData(IDataReader reader) {
        System.out.println("\n>>> Le client traite les données via IDataReader <<<\n");

        // Le client utilise uniquement les méthodes de l'interface
        System.out.println("1. Récupération du nombre d'enregistrements :");
        int count = reader.getRecordCount();
        System.out.println("   → Nombre d'enregistrements : " + count + "\n");

        System.out.println("2. Récupération des données :");
        String data = reader.getData();
        System.out.println("   → Données brutes :\n" + data + "\n");

        System.out.println("3. Affichage formaté des données :");
        reader.displayData();
    }

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Adapter ===\n");

        // Démonstration : utilisation directe de LegacyLibrary (problème)
        System.out.println("PROBLÈME : Utilisation directe de LegacyLibrary");
        System.out.println("--------------------------------------------------");
        LegacyLibrary legacyLib = new LegacyLibrary();
        System.out.println("La librairie legacy a des méthodes incompatibles :");
        System.out.println("- fetchRawDataFromLegacySystem() au lieu de getData()");
        System.out.println("- getTotalElements() au lieu de getRecordCount()");
        System.out.println("- printRawData() au lieu de displayData()");
        System.out.println("\nFormat d'affichage de la librairie legacy :");
        legacyLib.printRawData();

        System.out.println("\n==================================================\n");

        // Solution : utilisation de l'Adapter
        System.out.println("SOLUTION : Utilisation du pattern Adapter");
        System.out.println("--------------------------------------------------");
        System.out.println("Création d'un adaptateur pour la librairie legacy...\n");

        // Création de l'adaptateur
        IDataReader adapter = new DataAdapter(legacyLib);

        // Le client peut maintenant utiliser l'interface standard
        processData(adapter);

        System.out.println("\n==================================================\n");

        // Démonstration supplémentaire
        System.out.println("AVANTAGE : Flexibilité et découplage");
        System.out.println("--------------------------------------------------");
        System.out.println("Le client peut travailler avec n'importe quelle");
        System.out.println("implémentation de IDataReader sans modification.");
        System.out.println("\nExemple : création d'un deuxième adaptateur...\n");

        LegacyLibrary anotherLegacyLib = new LegacyLibrary();
        IDataReader anotherAdapter = new DataAdapter(anotherLegacyLib);

        System.out.println("Nombre d'enregistrements : " + anotherAdapter.getRecordCount());

        System.out.println("\n==================================================");
        System.out.println("✓ Le pattern Adapter permet de :");
        System.out.println("  - Rendre compatibles des interfaces incompatibles");
        System.out.println("  - Utiliser des librairies externes sans modification");
        System.out.println("  - Découpler le code client des implémentations");
        System.out.println("  - Faciliter l'intégration de systèmes legacy");
    }
}