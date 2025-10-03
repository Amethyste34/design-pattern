package org.example.abstractfactory;

/**
 * Implémentation concrète d'un menu MacOS.
 */
public class MacMenu implements Menu {

    @Override
    public void display() {
        System.out.println("[MacOS] Affichage d'un menu Mac avec barre supérieure");
    }
}