package org.example.composite;

/**
 * Interface commune pour tous les composants du système de fichiers.
 * Définit les opérations que doivent supporter les fichiers et les dossiers.
 */
public interface FileSystemComponent {
    /**
     * Affiche les informations du composant.
     *
     * @param indent le niveau d'indentation pour l'affichage hiérarchique
     */
    void display(String indent);

    /**
     * Retourne le nom du composant.
     *
     * @return le nom
     */
    String getName();

    /**
     * Retourne la taille du composant en Ko.
     *
     * @return la taille
     */
    int getSize();
}