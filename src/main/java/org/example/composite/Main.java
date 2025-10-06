package org.example.composite;

/**
 * Classe Main pour tester l'implémentation du pattern Composite.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Composite ===\n");

        // Création de fichiers simples
        File file1 = new File("document.txt", 15);
        File file2 = new File("image.jpg", 250);
        File file3 = new File("video.mp4", 5000);
        File file4 = new File("rapport.pdf", 320);
        File file5 = new File("presentation.pptx", 1200);
        File file6 = new File("code.java", 8);
        File file7 = new File("readme.md", 3);

        // Création de dossiers
        Directory root = new Directory("root");
        Directory documents = new Directory("Documents");
        Directory media = new Directory("Media");
        Directory images = new Directory("Images");
        Directory videos = new Directory("Videos");
        Directory projects = new Directory("Projets");

        // Construction de l'arborescence
        // root/
        //   ├─ Documents/
        //   │   ├─ document.txt
        //   │   └─ rapport.pdf
        //   ├─ Media/
        //   │   ├─ Images/
        //   │   │   └─ image.jpg
        //   │   └─ Videos/
        //   │       └─ video.mp4
        //   └─ Projets/
        //       ├─ code.java
        //       ├─ readme.md
        //       └─ presentation.pptx

        documents.add(file1);
        documents.add(file4);

        images.add(file2);
        videos.add(file3);

        media.add(images);
        media.add(videos);

        projects.add(file6);
        projects.add(file7);
        projects.add(file5);

        root.add(documents);
        root.add(media);
        root.add(projects);

        // Affichage de l'arborescence complète
        System.out.println("1. Arborescence complète du système de fichiers");
        System.out.println("==================================================");
        root.display("");

        System.out.println("\n==================================================\n");

        // Statistiques
        System.out.println("2. Statistiques du système de fichiers");
        System.out.println("==================================================");
        System.out.println("Taille totale : " + root.getSize() + " Ko");
        System.out.println("Nombre de fichiers : " + root.countFiles());
        System.out.println("Nombre de dossiers : " + root.countDirectories());

        System.out.println("\n==================================================\n");

        // Affichage d'un sous-dossier
        System.out.println("3. Affichage du dossier 'Media' uniquement");
        System.out.println("==================================================");
        media.display("");

        System.out.println("\n==================================================\n");

        // Démonstration : traitement uniforme
        System.out.println("4. Traitement uniforme (polymorphisme)");
        System.out.println("==================================================");
        System.out.println("Le client peut traiter fichiers et dossiers de la même manière :\n");

        FileSystemComponent[] components = {file1, documents, media, root};

        for (FileSystemComponent component : components) {
            System.out.println("Composant : " + component.getName());
            System.out.println("Taille : " + component.getSize() + " Ko");
            System.out.println("Type : " + (component instanceof File ? "Fichier" : "Dossier"));
            System.out.println();
        }

        System.out.println("==================================================\n");

        // Modification dynamique de l'arborescence
        System.out.println("5. Modification dynamique de l'arborescence");
        System.out.println("==================================================");
        System.out.println("Ajout d'un nouveau fichier dans 'Documents'...\n");

        File newFile = new File("nouveau.docx", 450);
        documents.add(newFile);

        System.out.println("Arborescence mise à jour :");
        root.display("");

        System.out.println("\n==================================================\n");

        System.out.println("6. Suppression d'un élément");
        System.out.println("==================================================");
        System.out.println("Suppression du fichier 'rapport.pdf'...\n");

        documents.remove(file4);

        System.out.println("Arborescence après suppression :");
        documents.display("");

        System.out.println("\n==================================================");
        System.out.println("✓ Le pattern Composite permet de :");
        System.out.println("  - Traiter uniformément objets simples et composites");
        System.out.println("  - Construire des structures arborescentes");
        System.out.println("  - Simplifier le code client (pas de conditions)");
        System.out.println("  - Ajouter/retirer des éléments dynamiquement");
        System.out.println("==================================================");
    }
}