package org.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Station météorologique - le Subject concret
 * Maintient les données météo et notifie les observateurs lors des changements
 */
public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("[STATION] ✓ Nouvel observateur enregistré (Total : " + observers.size() + ")");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("[STATION] ✓ Observateur retiré (Total : " + observers.size() + ")");
    }

    @Override
    public void notifyObservers() {
        System.out.println("[STATION] 📡 Notification de " + observers.size() + " observateur(s)...");
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Méthode appelée lorsque de nouvelles mesures arrivent
     * Déclenche automatiquement la notification des observateurs
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        System.out.println("\n════════════════════════════════════════════════════");
        System.out.println("[STATION] 🌡️  NOUVELLES MESURES REÇUES");
        System.out.println("  → Température : " + temperature + "°C");
        System.out.println("  → Humidité    : " + humidity + "%");
        System.out.println("  → Pression    : " + pressure + " hPa");
        System.out.println("════════════════════════════════════════════════════");

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // Notification automatique de tous les observateurs
        notifyObservers();
    }

    // Getters pour accès direct si nécessaire
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}