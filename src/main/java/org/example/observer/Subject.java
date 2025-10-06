package org.example.observer;

/**
 * Interface Subject : définit le contrat pour les objets observables
 */
public interface Subject {
    /**
     * Enregistre un nouvel observateur
     * @param observer L'observateur à ajouter
     */
    void registerObserver(Observer observer);

    /**
     * Supprime un observateur
     * @param observer L'observateur à retirer
     */
    void removeObserver(Observer observer);

    /**
     * Notifie tous les observateurs enregistrés
     */
    void notifyObservers();
}