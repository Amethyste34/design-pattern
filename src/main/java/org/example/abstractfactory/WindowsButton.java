package org.example.abstractfactory;

/**
 * Implémentation concrète d'un bouton Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("[Windows] Affichage d'un bouton Windows avec style Aero");
    }
}