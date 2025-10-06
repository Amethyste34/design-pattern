package org.example.template_method;

/**
 * Classe concrète : Préparation d'un thé
 */
public class The extends BoissonChaud {

    private boolean avecCitron;

    /**
     * Constructeur
     * @param avecCitron Si true, ajoute du citron au thé
     */
    public The(boolean avecCitron) {
        this.avecCitron = avecCitron;
    }

    /**
     * Constructeur par défaut : thé avec citron
     */
    public The() {
        this(true);
    }

    @Override
    protected void preparer() {
        System.out.println("Étape 2 : Infuser le sachet de thé...");
        System.out.println("   → Thé vert / Earl Grey");
        System.out.println("   → Temps d'infusion : 3-5 minutes");
    }

    @Override
    protected void ajouterIngredients() {
        System.out.println("Étape 4 : Ajouter des ingrédients...");
        if (avecCitron) {
            System.out.println("   → Ajout d'une tranche de citron");
        } else {
            System.out.println("   → Pas d'ajout (thé nature)");
        }
    }

    @Override
    protected boolean souhaiteAjouterIngredients() {
        // Le hook permet de contrôler si on veut ajouter des ingrédients
        return avecCitron;
    }

    @Override
    protected String getNom() {
        return "Thé";
    }
}