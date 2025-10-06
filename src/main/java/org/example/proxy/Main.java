package org.example.proxy;

/**
 * Classe de test du pattern Proxy avec contrôle d'accès
 * Démontre la protection des opérations sensibles
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("═══════════════════════════════════════════════════");
        System.out.println("  TEST 1 : ADMINISTRATEUR");
        System.out.println("═══════════════════════════════════════════════════\n");

        // Création d'un proxy pour un administrateur
        ServerAccess adminAccess = new ProxyServerAccess("ADMIN");

        adminAccess.connect();
        System.out.println();

        adminAccess.viewLogs();
        System.out.println();

        adminAccess.reboot();
        System.out.println();

        adminAccess.deleteUser("jean.dupont");
        System.out.println();

        adminAccess.modifyConfig("max_connexions", "1000");


        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("  TEST 2 : UTILISATEUR SIMPLE");
        System.out.println("═══════════════════════════════════════════════════\n");

        // Création d'un proxy pour un utilisateur simple
        ServerAccess userAccess = new ProxyServerAccess("USER");

        userAccess.connect();
        System.out.println();

        userAccess.viewLogs();
        System.out.println();

        // Tentatives d'actions sensibles - doivent être bloquées
        userAccess.reboot();
        System.out.println();

        userAccess.deleteUser("marie.martin");
        System.out.println();

        userAccess.modifyConfig("timeout", "30");


        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("  TEST 3 : UTILISATEUR INVITÉ");
        System.out.println("═══════════════════════════════════════════════════\n");

        // Création d'un proxy pour un invité
        ServerAccess guestAccess = new ProxyServerAccess("GUEST");

        guestAccess.connect();
        System.out.println();

        guestAccess.deleteUser("admin");

        System.out.println("\n═══════════════════════════════════════════════════");
    }
}