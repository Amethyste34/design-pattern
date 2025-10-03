package org.example.singleton;

/**
 * Classe DatabaseConnection implémentant le pattern Singleton
 * pour garantir une seule instance de connexion à la base de données.
 */
public class DatabaseConnection {

    // Instance unique de la classe (static)
    private static DatabaseConnection instance;

    // Attribut simulant l'état de la connexion
    private String connectionState;

    /**
     * Constructeur privé pour empêcher l'instanciation directe
     * depuis l'extérieur de la classe.
     */
    private DatabaseConnection() {
        // Simulation d'une initialisation coûteuse
        System.out.println("Initialisation de la connexion à la base de données...");
        this.connectionState = "Connexion à la base de données initialisée.";
    }

    /**
     * Méthode statique qui retourne l'instance unique de DatabaseConnection.
     * Si l'instance n'existe pas encore, elle est créée.
     *
     * @return l'instance unique de DatabaseConnection
     */
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    /**
     * Méthode simulant l'obtention d'une connexion.
     *
     * @return le message de confirmation de la connexion
     */
    public String getConnection() {
        return connectionState;
    }

    /**
     * Méthode utilitaire pour afficher l'état de la connexion.
     */
    public void displayConnectionInfo() {
        System.out.println(connectionState);
        System.out.println("Hash de l'instance : " + this.hashCode());
    }
}