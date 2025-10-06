package org.example.command;

/**
 * Receveur (Receiver) : représente une lumière
 * Contient la logique métier réelle
 */
public class Light {
    private String location;
    private Boolean isOn;

    public Light(String location) {
        this.location = location;
        this.isOn = false;
    }

    /**
     * Allume la lumière
     */
    public void turnOn() {
        this.isOn = true;
        System.out.println("💡 [" + location + "] Lumière ALLUMÉE");
    }

    /**
     * Eteint la lumière
     */
    public void turnOff() {
        this.isOn = false;
        System.out.println("🌑 [" + location + "] Lumière ÉTEINTE");
    }

    /**
     * Vérifie l'état de la lumière
     * @return isOn;
     */
    public boolean isOn() {
        return this.isOn;
    }

    /**
     * Getter
     * @return location
     */
    public String getLocation() {
        return this.location;
    }
}