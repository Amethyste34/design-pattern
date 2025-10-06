package org.example.command;

/**
 * Receveur (Receiver) : représente un ventilateur
 * Contient la logique métier réelle
 */
public class Fan {

    private String location;
    private int speed; // 0 = éteint, 1 = faible, 2 = moyen, 3 = fort

    public Fan(String location) {
        this.location = location;
        this.speed = 0;
    }

    /**
     * Allume le ventilateur à vitesse moyenne
     */
    public void turnOn() {
        speed = 2;
        System.out.println("🌀 [" + location + "] Ventilateur ALLUMÉ (vitesse moyenne)");
    }

    /**
     * Éteint le ventilateur
     */
    public void turnOff() {
        speed = 0;
        System.out.println("⭕ [" + location + "] Ventilateur ÉTEINT");
    }

    /**
     * Règle la vitesse du ventilateur
     */
    public void setSpeed(int speed) {
        this.speed = speed;
        String speedLabel;
        switch (speed) {
            case 0:
                speedLabel = "éteint";
                break;
            case 1:
                speedLabel = "faible";
                break;
            case 2:
                speedLabel = "moyen";
                break;
            case 3:
                speedLabel = "fort";
                break;
            default:
                speedLabel = "inconnu";
        }
        System.out.println("🌀 [" + location + "] Vitesse du ventilateur : " + speedLabel);
    }

    public int getSpeed() {
        return speed;
    }

    public String getLocation() {
        return location;
    }
}