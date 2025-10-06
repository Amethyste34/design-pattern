package org.example.state;

/**
 * Contexte : Machine à boisson qui délègue son comportement à son état actuel
 */
public class MachineBoisson {

    // Tous les états possibles
    private State etatEnAttente;
    private State etatPieceInseree;
    private State etatDistribution;
    private State etatRupture;

    // État actuel
    private State currentState;

    // Stock de boissons
    private int stock;

    /**
     * Constructeur : initialise la machine avec un stock donné
     */
    public MachineBoisson(int stockInitial) {
        // Création de tous les états
        etatEnAttente = new EtatEnAttente(this);
        etatPieceInseree = new EtatPieceInseree(this);
        etatDistribution = new EtatDistribution(this);
        etatRupture = new EtatRupture(this);

        this.stock = stockInitial;

        // État initial
        if (stock > 0) {
            currentState = etatEnAttente;
        } else {
            currentState = etatRupture;
        }
    }

    // Méthodes publiques qui délèguent à l'état actuel

    public void insererPiece() {
        currentState.insererPiece();
    }

    public void ejecterPiece() {
        currentState.ejecterPiece();
    }

    public void selectionnerBoisson() {
        currentState.selectionnerBoisson();
    }

    public void distribuerBoisson() {
        currentState.distribuerBoisson();
    }

    public void remplirStock() {
        currentState.remplirStock();
    }

    // Gestion de l'état

    public void setState(State state) {
        this.currentState = state;
        System.out.println("🔄 État changé : " + state.toString());
    }

    // Gestion du stock

    public void diminuerStock() {
        if (stock > 0) {
            stock--;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Getters des états (pour les transitions)

    public State getEtatEnAttente() {
        return etatEnAttente;
    }

    public State getEtatPieceInseree() {
        return etatPieceInseree;
    }

    public State getEtatDistribution() {
        return etatDistribution;
    }

    public State getEtatRupture() {
        return etatRupture;
    }

    /**
     * Affiche l'état actuel de la machine
     */
    public void afficherEtat() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   MACHINE À BOISSON - ÉTAT ACTUEL      ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  État     : " + currentState.toString());
        System.out.println("║  Stock    : " + stock + " boisson(s)");
        System.out.println("╚════════════════════════════════════════╝");
    }
}