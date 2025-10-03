package org.example.singleton;

/**
 * Classe Main pour tester l'implémentation du pattern Singleton.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Singleton ===\n");

        // Première demande d'instance
        System.out.println("1. Première demande de connexion :");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.displayConnectionInfo();
        System.out.println(db1.getConnection());

        System.out.println("\n--------------------------------------------------\n");

        // Deuxième demande d'instance
        System.out.println("2. Deuxième demande de connexion :");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.displayConnectionInfo();

        System.out.println("\n" + "-".repeat(50) + "\n");

        // Troisième demande d'instance
        System.out.println("3. Troisième demande de connexion :");
        DatabaseConnection db3 = DatabaseConnection.getInstance();
        db3.displayConnectionInfo();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Vérification que toutes les références pointent vers le même objet
        System.out.println("=== Vérification de l'unicité de l'instance ===\n");
        System.out.println("db1 == db2 : " + (db1 == db2));
        System.out.println("db2 == db3 : " + (db2 == db3));
        System.out.println("db1 == db3 : " + (db1 == db3));

        System.out.println("\n✓ Toutes les références pointent vers la même instance !");
        System.out.println("✓ Le pattern Singleton fonctionne correctement.");
    }
}