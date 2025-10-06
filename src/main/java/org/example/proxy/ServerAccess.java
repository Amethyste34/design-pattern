package org.example.proxy;

/**
 * Interface définissant les opérations d'administration du serveur
 */
public interface ServerAccess {

    /**
     * Connexion au serveur - accessible à tous
     */
    void connect();

    /**
     * Consultation des logs - accessible à tous
     */
    void viewLogs();

    /**
     * Redémarrage du serveur - SENSIBLE
     */
    void reboot();

    /**
     * Suppression d'un utilisateur - SENSIBLE
     */
    void deleteUser(String username);

    /**
     * Modification de la configuration - SENSIBLE
     */
    void modifyConfig(String parameter, String value);
}