package org.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un dossier (composant composite).
 * Un dossier peut contenir des fichiers et d'autres dossiers.
 */
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children;

    /**
     * Constructeur d'un dossier.
     *
     * @param name le nom du dossier
     */
    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    /**
     * Ajoute un composant (fichier ou dossier) au dossier.
     *
     * @param component le composant à ajouter
     */
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    /**
     * Retire un composant du dossier.
     *
     * @param component le composant à retirer
     */
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    /**
     * Retourne la liste des composants enfants.
     *
     * @return la liste des enfants
     */
    public List<FileSystemComponent> getChildren() {
        return children;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📁 " + name + "/ (" + getSize() + " Ko total)");

        // Affichage récursif de tous les enfants
        for (FileSystemComponent child : children) {
            child.display(indent + "  ");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        // La taille d'un dossier est la somme des tailles de ses enfants
        int totalSize = 0;
        for (FileSystemComponent child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    /**
     * Compte le nombre total de fichiers dans le dossier (récursivement).
     *
     * @return le nombre de fichiers
     */
    public int countFiles() {
        int count = 0;
        for (FileSystemComponent child : children) {
            if (child instanceof File) {
                count++;
            } else if (child instanceof Directory) {
                count += ((Directory) child).countFiles();
            }
        }
        return count;
    }

    /**
     * Compte le nombre total de dossiers dans le dossier (récursivement).
     *
     * @return le nombre de dossiers
     */
    public int countDirectories() {
        int count = 0;
        for (FileSystemComponent child : children) {
            if (child instanceof Directory) {
                count++;
                count += ((Directory) child).countDirectories();
            }
        }
        return count;
    }
}