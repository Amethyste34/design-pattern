package org.example.proxy;

/**
 * Classe réelle implémentant les opérations d'administration
 * Cette classe n'a aucune logique de sécurité - elle fait confiance à l'appelant
 */
public class RealServerAccess implements ServerAccess {

    @Override
    public void connect() {
        System.out.println("[SERVEUR] ✓ Connexion établie au serveur");
    }

    @Override
    public void viewLogs() {
        System.out.println("[SERVEUR] ✓ Affichage des logs système...");
        System.out.println("  → 2025-10-06 10:23:45 - INFO: Server started");
        System.out.println("  → 2025-10-06 10:24:12 - WARN: High memory usage");
    }

    @Override
    public void reboot() {
        System.out.println("[SERVEUR] ⚠️  REDÉMARRAGE DU SERVEUR EN COURS...");
        System.out.println("[SERVEUR] ✓ Serveur redémarré avec succès");
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("[SERVEUR] ⚠️  SUPPRESSION de l'utilisateur : " + username);
        System.out.println("[SERVEUR] ✓ Utilisateur '" + username + "' supprimé de la base de données");
    }

    @Override
    public void modifyConfig(String parameter, String value) {
        System.out.println("[SERVEUR] ⚠️  MODIFICATION de la configuration");
        System.out.println("[SERVEUR] ✓ Paramètre '" + parameter + "' modifié : " + value);
    }
}