package org.example.adapter;

/**
 * Classe représentant une ancienne librairie externe.
 * Cette librairie a des méthodes incompatibles avec l'interface IDataReader.
 */
public class LegacyLibrary {
    private String[] rawData;

    /**
     * Constructeur initialisant des données de test.
     */
    public LegacyLibrary() {
        // Simulation de données provenant d'un ancien système
        this.rawData = new String[] {
                "Record#1:John Doe:Developer",
                "Record#2:Jane Smith:Designer",
                "Record#3:Bob Johnson:Manager",
                "Record#4:Alice Williams:Tester"
        };
    }

    /**
     * Méthode de l'ancienne librairie pour obtenir les données brutes.
     * Note : Le nom de la méthode et le format sont différents de l'interface attendue.
     *
     * @return tableau de chaînes de caractères
     */
    public String[] fetchRawDataFromLegacySystem() {
        System.out.println("[LegacyLibrary] Récupération des données du système ancien...");
        return rawData;
    }

    /**
     * Méthode de l'ancienne librairie pour compter les éléments.
     * Note : Le nom de la méthode est différent de l'interface attendue.
     *
     * @return le nombre d'éléments
     */
    public int getTotalElements() {
        return rawData.length;
    }

    /**
     * Méthode de l'ancienne librairie pour afficher les données brutes.
     * Note : Le format d'affichage est différent de celui attendu.
     */
    public void printRawData() {
        System.out.println("=== LEGACY FORMAT ===");
        for (String record : rawData) {
            System.out.println(">> " + record);
        }
        System.out.println("=====================");
    }
}