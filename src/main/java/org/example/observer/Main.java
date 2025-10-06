package org.example.observer;

/**
 * Classe de test du pattern Observer
 * Démontre la notification automatique des observateurs
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║     APPLICATION MÉTÉO - PATTERN OBSERVER          ║");
        System.out.println("╚═══════════════════════════════════════════════════╝\n");

        // Création de la station météo (le Subject)
        WeatherStation weatherStation = new WeatherStation();

        System.out.println("🏗️  Initialisation des observateurs...\n");

        // Création et enregistrement automatique des observateurs
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);

        // Simulation de mesures météo
        System.out.println("\n🌤️  Simulation de mesures météorologiques...\n");

        weatherStation.setMeasurements(22.5f, 65.0f, 1013.0f);

        // Petite pause pour la lisibilité
        pause(1500);

        weatherStation.setMeasurements(24.0f, 70.0f, 1012.5f);

        pause(1500);

        weatherStation.setMeasurements(19.5f, 80.0f, 1010.0f);

        pause(1500);

        weatherStation.setMeasurements(26.5f, 55.0f, 1015.0f);

        // Démonstration de la suppression d'un observateur
        System.out.println("\n\n🔧 Désactivation de l'affichage des statistiques...\n");
        weatherStation.removeObserver(statisticsDisplay);

        pause(1000);

        weatherStation.setMeasurements(28.0f, 50.0f, 1016.0f);

        System.out.println("\n\n✅ Démonstration terminée !");
        System.out.println("Les observateurs ont été notifiés automatiquement à chaque changement.");
    }

    /**
     * Méthode utilitaire pour ajouter une pause
     */
    private static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}