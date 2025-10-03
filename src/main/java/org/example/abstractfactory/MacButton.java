package org.example.abstractfactory;

/**
 * Implémentation concrète d'un bouton MacOS.
 */
public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("[MacOS] Affichage d'un bouton Mac avec style Aqua");
    }
}