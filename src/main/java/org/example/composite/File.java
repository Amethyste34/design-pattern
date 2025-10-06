package org.example.composite;

/**
 * Classe représentant un fichier simple (composant feuille).
 * Un fichier ne peut pas contenir d'autres composants.
 */
public class File implements FileSystemComponent {
    private String name;
    private int size; // Taille en Ko

    /**
     * Constructeur d'un fichier.
     *
     * @param name le nom du fichier
     * @param size la taille du fichier en Ko
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📄 " + name + " (" + size + " Ko)");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}