package org.example.command;

/**
 * Interface Command : définit le contrat pour toutes les commandes
 */
public interface Command {

    /**
     * Exécute la commande
     */
    void execute();

    /**
     * Annule la commande
     */
    void undo();
}