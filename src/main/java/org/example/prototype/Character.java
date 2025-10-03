package org.example.prototype;

/**
 * Classe abstraite Character implémentant le pattern Prototype.
 * Définit les comportements communs à tous les personnages.
 */
public abstract class Character implements Cloneable {
    // Attributs communs à tous les personnages
    protected String name;
    protected int health;
    protected String weapon;
    protected int level;

    /**
     * Constructeur par défaut.
     */
    public Character() {
    }

    /**
     * Constructeur avec paramètres.
     */
    public Character(String name, int health, String weapon, int level) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.level = level;
    }

    /**
     * Méthode clone() pour créer une copie du personnage.
     * Implémente le pattern Prototype.
     *
     * @return une copie du personnage
     */
    @Override
    public Character clone() {
        try {
            return (Character) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Erreur lors du clonage : " + e.getMessage());
            return null;
        }
    }

    /**
     * Méthode abstraite que chaque type de personnage doit implémenter.
     */
    public abstract void attack();

    /**
     * Méthode commune pour afficher les informations du personnage.
     */
    public void displayInfo() {
        System.out.println("Nom: " + name);
        System.out.println("Points de vie: " + health);
        System.out.println("Arme: " + weapon);
        System.out.println("Niveau: " + level);
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}