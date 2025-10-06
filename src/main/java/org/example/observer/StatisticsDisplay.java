package org.example.observer;

/**
 * Affichage des statistiques météorologiques - Observer concret
 * Calcule et affiche les moyennes, min et max
 */
public class StatisticsDisplay implements Observer {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    private Subject weatherStation;

    /**
     * Constructeur qui enregistre automatiquement cet observateur
     * @param weatherStation La station météo à observer
     */
    public StatisticsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    /**
     * Affiche les statistiques calculées
     */
    public void display() {
        float avgTemp = tempSum / numReadings;

        System.out.println("\n┌─────────────────────────────────────────┐");
        System.out.println("│   📈 STATISTIQUES                       │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│  Température moyenne : %.1f°C           │%n", avgTemp);
        System.out.printf("│  Température max     : %.1f°C           │%n", maxTemp);
        System.out.printf("│  Température min     : %.1f°C           │%n", minTemp);
        System.out.printf("│  Nombre de lectures  : %d                │%n", numReadings);
        System.out.println("└─────────────────────────────────────────┘");
    }
}