package org.example.state;

/**
 * Interface State : définit le contrat pour tous les états de la machine
 */
public interface State {

    /**
     * Action : insérer une pièce dans la machine
     */
    void insererPiece();

    /**
     * Action : éjecter la pièce (annulation)
     */
    void ejecterPiece();

    /**
     * Action : sélectionner une boisson
     */
    void selectionnerBoisson();

    /**
     * Action : distribuer la boisson
     */
    void distribuerBoisson();

    /**
     * Action : remettre du stock
     */
    void remplirStock();
}