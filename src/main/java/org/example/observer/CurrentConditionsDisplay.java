package org.example.observer;

/**
 * Affichage des conditions météorologiques actuelles - Observer concret
 */
public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherStation;

    /**
     * Constructeur qui enregistre automatiquement cet observateur
     * @param weatherStation La station météo à observer
     */
    public CurrentConditionsDisplay(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     * Affiche les conditions actuelles
     */
    public void display() {
        System.out.println("\n┌─────────────────────────────────────────┐");
        System.out.println("│   📊 CONDITIONS ACTUELLES               │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│  Température : %.1f°C                   │%n", temperature);
        System.out.printf("│  Humidité    : %.1f%%                    │%n", humidity);

        // Ajout d'un commentaire selon la température
        String comment;
        if (temperature < 0) {
            comment = "Il fait froid ! ❄️                │";
        } else if (temperature < 15) {
            comment = "Temps frais 🧥                │";
        } else if (temperature < 25) {
            comment = "Température agréable 😊                │";
        } else {
            comment = "Il fait chaud ! ☀️                     │";
        }
        System.out.println("│  " + comment);
        System.out.println("└─────────────────────────────────────────┘");
    }
}