package org.example.adapter;

/**
 * Interface attendue par le client.
 * Définit les méthodes standard pour lire des données.
 */
public interface IDataReader {
    /**
     * Récupère les données sous forme de chaîne de caractères.
     *
     * @return les données
     */
    String getData();

    /**
     * Récupère le nombre d'enregistrements.
     *
     * @return le nombre d'enregistrements
     */
    int getRecordCount();

    /**
     * Affiche les données de manière formatée.
     */
    void displayData();
}