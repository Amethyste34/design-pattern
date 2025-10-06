package org.example.template_method;

/**
 * Classe concrète : Préparation d'un café
 */
public class Cafe extends BoissonChaud {

    private boolean avecSucre;
    private boolean avecLait;

    /**
     * Constructeur complet
     * @param avecSucre Si true, ajoute du sucre
     * @param avecLait Si true, ajoute du lait
     */
    public Cafe(boolean avecSucre, boolean avecLait) {
        this.avecSucre = avecSucre;
        this.avecLait = avecLait;
    }

    /**
     * Constructeur par défaut : café avec sucre et lait
     */
    public Cafe() {
        this(true, true);
    }

    @Override
    protected void preparer() {
        System.out.println("Étape 2 : Infuser le café moulu...");
        System.out.println("   → Café arabica");
        System.out.println("   → Méthode : filtre / expresso");
    }

    @Override
    protected void ajouterIngredients() {
        System.out.println("Étape 4 : Ajouter des ingrédients...");

        if (avecSucre && avecLait) {
            System.out.println("   → Ajout de sucre (1 cuillère)");
            System.out.println("   → Ajout de lait (20ml)");
        } else if (avecSucre) {
            System.out.println("   → Ajout de sucre (1 cuillère)");
        } else if (avecLait) {
            System.out.println("   → Ajout de lait (20ml)");
        } else {
            System.out.println("   → Café noir (sans ajout)");
        }
    }

    @Override
    protected boolean souhaiteAjouterIngredients() {
        // On ajoute des ingrédients seulement si au moins l'un est demandé
        return avecSucre || avecLait;
    }

    @Override
    protected String getNom() {
        return "Café";
    }
}