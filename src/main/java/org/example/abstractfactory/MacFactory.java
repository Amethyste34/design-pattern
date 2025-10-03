package org.example.abstractfactory;

/**
 * Fabrique concrète pour créer des composants GUI MacOS.
 */
public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}