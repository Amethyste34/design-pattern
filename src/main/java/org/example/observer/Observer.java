package org.example.observer;

/**
 * Interface Observer : définit le contrat pour les objets qui veulent être notifiés
 */
public interface Observer {
    /**
     * Méthode appelée automatiquement lorsque les données météo changent
     * @param temperature La nouvelle température (en °C)
     * @param humidity Le nouveau taux d'humidité (en %)
     * @param pressure La nouvelle pression atmosphérique (en hPa)
     */
    void update(float temperature, float humidity, float pressure);
}