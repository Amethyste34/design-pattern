package org.example.prototype;

/**
 * Classe concrète Warrior (Guerrier) héritant de Character.
 * Définit des comportements spécifiques au guerrier.
 */
public class Warrior extends Character {
    // Attribut spécifique au guerrier
    private String armorType;

    /**
     * Constructeur pour créer un guerrier prototype.
     */
    public Warrior(String name, int health, String weapon, int level, String armorType) {
        super(name, health, weapon, level);
        this.armorType = armorType;
    }

    /**
     * Implémentation de l'attaque spécifique au guerrier.
     */
    @Override
    public void attack() {
        System.out.println(name + " effectue une attaque puissante avec " + weapon + " !");
        System.out.println("Dégâts infligés : " + (level * 15) + " points");
    }

    /**
     * Comportement spécifique au guerrier : défense.
     */
    public void defend() {
        System.out.println(name + " se protège avec son armure " + armorType);
        System.out.println("Défense augmentée de " + (level * 10) + " points");
    }

    /**
     * Affichage des informations du guerrier (surcharge).
     */
    @Override
    public void displayInfo() {
        System.out.println("=== GUERRIER ===");
        super.displayInfo();
        System.out.println("Type d'armure: " + armorType);
        System.out.println("================");
    }

    /**
     * Méthode clone() spécifique au guerrier.
     * Peut être surchargée pour gérer des clonages spéciaux si nécessaire.
     */
    @Override
    public Warrior clone() {
        return (Warrior) super.clone();
    }

    // Getters et Setters
    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }
}