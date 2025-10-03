package org.example.abstractfactory;

/**
 * Interface Abstract Factory définissant les méthodes pour créer
 * une famille de produits (Button et Menu).
 */
public interface GUIFactory {
    /**
     * Crée un bouton spécifique à la plateforme.
     *
     * @return une instance de Button
     */
    Button createButton();

    /**
     * Crée un menu spécifique à la plateforme.
     *
     * @return une instance de Menu
     */
    Menu createMenu();
}