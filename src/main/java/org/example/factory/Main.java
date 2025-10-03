package org.example.factory;

/**
 * Classe Main pour tester l'implémentation du pattern Factory Method.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Factory Method ===\n");

        // Création d'un cercle via sa fabrique
        System.out.println("1. Création d'un cercle :");
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();

        System.out.println("\n--------------------------------------------------\n");

        // Création d'un rectangle via sa fabrique
        System.out.println("2. Création d'un rectangle :");
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.getShape();
        rectangle.draw();

        System.out.println("\n--------------------------------------------------\n");

        // Création d'un triangle via sa fabrique
        System.out.println("3. Création d'un triangle :");
        ShapeFactory triangleFactory = new TriangleFactory();
        Shape triangle = triangleFactory.getShape();
        triangle.draw();

        System.out.println("\n==================================================\n");

        // Démonstration : création de plusieurs formes
        System.out.println("=== Création de plusieurs formes ===\n");

        ShapeFactory[] factories = {
                new CircleFactory(),
                new RectangleFactory(),
                new TriangleFactory(),
                new CircleFactory()
        };

        for (int i = 0; i < factories.length; i++) {
            System.out.println("Forme " + (i + 1) + " :");
            Shape shape = factories[i].getShape();
            shape.draw();
            System.out.println();
        }

        System.out.println("==================================================");
        System.out.println("✓ Le pattern Factory Method permet d'ajouter");
        System.out.println("  de nouvelles formes sans modifier le code client !");
    }
}