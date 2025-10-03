package org.example.adapter;

/**
 * Classe Adapter qui fait le pont entre l'interface IDataReader
 * et la classe LegacyLibrary.
 *
 * Cette classe adapte les méthodes de l'ancienne librairie
 * pour qu'elles correspondent à l'interface attendue.
 */
public class DataAdapter implements IDataReader {
    private LegacyLibrary legacyLibrary;

    /**
     * Constructeur qui prend une instance de LegacyLibrary.
     *
     * @param legacyLibrary l'ancienne librairie à adapter
     */
    public DataAdapter(LegacyLibrary legacyLibrary) {
        this.legacyLibrary = legacyLibrary;
    }

    /**
     * Adapte la méthode fetchRawDataFromLegacySystem() de LegacyLibrary
     * pour correspondre à getData() de IDataReader.
     *
     * @return les données sous forme de chaîne unique
     */
    @Override
    public String getData() {
        System.out.println("[DataAdapter] Adaptation des données du format legacy...");
        String[] rawData = legacyLibrary.fetchRawDataFromLegacySystem();

        // Conversion du tableau en une seule chaîne
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rawData.length; i++) {
            result.append(rawData[i]);
            if (i < rawData.length - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Adapte la méthode getTotalElements() de LegacyLibrary
     * pour correspondre à getRecordCount() de IDataReader.
     *
     * @return le nombre d'enregistrements
     */
    @Override
    public int getRecordCount() {
        System.out.println("[DataAdapter] Récupération du nombre d'enregistrements...");
        return legacyLibrary.getTotalElements();
    }

    /**
     * Adapte la méthode printRawData() de LegacyLibrary
     * pour correspondre à displayData() de IDataReader.
     * Formate les données dans un nouveau style.
     */
    @Override
    public void displayData() {
        System.out.println("[DataAdapter] Affichage des données dans le nouveau format...");
        String[] rawData = legacyLibrary.fetchRawDataFromLegacySystem();

        System.out.println("========================================");
        System.out.println("       DONNÉES ADAPTÉES (Nouveau Format)");
        System.out.println("========================================");

        for (String record : rawData) {
            // Parsing et reformatage des données
            String[] parts = record.split(":");
            if (parts.length == 3) {
                System.out.println("• ID: " + parts[0]);
                System.out.println("  Nom: " + parts[1]);
                System.out.println("  Poste: " + parts[2]);
                System.out.println("  --------");
            }
        }

        System.out.println("========================================");
        System.out.println("Total: " + legacyLibrary.getTotalElements() + " enregistrement(s)");
        System.out.println("========================================");
    }
}