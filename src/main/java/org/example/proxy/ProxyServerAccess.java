package org.example.proxy;

/**
 * Pattern Proxy : contrôle d'accès aux opérations du serveur
 * Vérifie les permissions avant de déléguer au serveur réel
 */
public class ProxyServerAccess implements ServerAccess {

    private RealServerAccess realServer;
    private String userRole;

    /**
     * Constructeur du proxy
     * @param userRole Le rôle de l'utilisateur (ex: "ADMIN", "USER")
     */
    public ProxyServerAccess(String userRole) {
        this.realServer = new RealServerAccess();
        this.userRole = userRole;
        System.out.println("[PROXY] Utilisateur connecté avec le rôle : " + userRole);
    }

    /**
     * Vérifie si l'utilisateur est administrateur
     */
    private boolean isAdmin() {
        return userRole.equalsIgnoreCase("ADMIN");
    }

    /**
     * Méthode utilitaire pour refuser l'accès
     */
    private void denyAccess(String action) {
        System.out.println("[PROXY] ❌ ACCÈS REFUSÉ : " + action);
        System.out.println("[PROXY] → Permissions insuffisantes (rôle actuel : " + userRole + ")");
    }

    @Override
    public void connect() {
        // Accessible à tous
        System.out.println("[PROXY] ✓ Autorisation accordée pour la connexion");
        realServer.connect();
    }

    @Override
    public void viewLogs() {
        // Accessible à tous
        System.out.println("[PROXY] ✓ Autorisation accordée pour consulter les logs");
        realServer.viewLogs();
    }

    @Override
    public void reboot() {
        // SENSIBLE - uniquement pour les admins
        if (isAdmin()) {
            System.out.println("[PROXY] ✓ Autorisation ADMIN accordée pour le redémarrage");
            realServer.reboot();
        } else {
            denyAccess("Redémarrage du serveur (privilèges ADMIN requis)");
        }
    }

    @Override
    public void deleteUser(String username) {
        // SENSIBLE - uniquement pour les admins
        if (isAdmin()) {
            System.out.println("[PROXY] ✓ Autorisation ADMIN accordée pour la suppression");
            realServer.deleteUser(username);
        } else {
            denyAccess("Suppression d'utilisateur (privilèges ADMIN requis)");
        }
    }

    @Override
    public void modifyConfig(String parameter, String value) {
        // SENSIBLE - uniquement pour les admins
        if (isAdmin()) {
            System.out.println("[PROXY] ✓ Autorisation ADMIN accordée pour la modification");
            realServer.modifyConfig(parameter, value);
        } else {
            denyAccess("Modification de configuration (privilèges ADMIN requis)");
        }
    }
}