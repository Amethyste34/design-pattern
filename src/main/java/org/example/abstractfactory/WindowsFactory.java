package org.example.abstractfactory;

/**
 * Fabrique concrète pour créer des composants GUI Windows.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}