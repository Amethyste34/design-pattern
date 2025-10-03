package org.example.abstractfactory;

/**
 * Implémentation concrète d'un menu Windows.
 */
public class WindowsMenu implements Menu {

    @Override
    public void display() {
        System.out.println("[Windows] Affichage d'un menu Windows avec barre de titre");
    }
}