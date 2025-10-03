package org.example.factory;

/**
 * Classe abstraite définissant la fabrique de formes.
 * Le pattern Factory Method délègue la création des objets aux sous-classes.
 */
public abstract class ShapeFactory {

    /**
     * Méthode abstraite (Factory Method) que les sous-classes
     * doivent implémenter pour créer une forme spécifique.
     *
     * @return une instance de Shape
     */
    public abstract Shape createShape();

    /**
     * Méthode template qui utilise la Factory Method.
     * Elle peut être utilisée pour ajouter de la logique commune.
     *
     * @return une forme créée et prête à être utilisée
     */
    public Shape getShape() {
        Shape shape = createShape();
        System.out.println("Forme créée via " + this.getClass().getSimpleName());
        return shape;
    }
}