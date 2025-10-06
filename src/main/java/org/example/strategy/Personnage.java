package org.example.strategy;

/**
 * Classe Personnage qui utilise le pattern Strategy
 * Le comportement de déplacement est délégué à une stratégie interchangeable
 */
public class Personnage {

    private String nom;
    private String type;
    private DeplacementStrategy deplacementStrategy;

    /**
     * Constructeur
     * @param nom Le nom du personnage
     * @param type Le type du personnage (ex: "Soldat", "Pilote", "Super-héros")
     * @param deplacementStrategy La stratégie de déplacement initiale
     */
    public Personnage(String nom, String type, DeplacementStrategy deplacementStrategy) {
        this.nom = nom;
        this.type = type;
        this.deplacementStrategy = deplacementStrategy;
    }

    /**
     * Change dynamiquement la stratégie de déplacement
     * @param deplacementStrategy La nouvelle stratégie
     */
    public void setDeplacementStrategy(DeplacementStrategy deplacementStrategy) {
        this.deplacementStrategy = deplacementStrategy;
        System.out.println("💡 " + nom + " a changé de mode de déplacement !");
    }

    /**
     * Délègue le déplacement à la stratégie actuelle
     */
    public void seDeplacer() {
        System.out.println("\n┌────────────────────────────────────────┐");
        System.out.println(" " + nom + " (" + type + ")");
        System.out.println("└────────────────────────────────────────┘");

        if (deplacementStrategy != null) {
            deplacementStrategy.deplacer();
        } else {
            System.out.println("❌ Aucune stratégie de déplacement définie !");
        }
    }

    /**
     * Présentation du personnage
     */
    public void sePresenter() {
        System.out.println("👤 Je suis " + nom + ", un " + type + ".");
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }
}