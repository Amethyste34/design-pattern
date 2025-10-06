package org.example.template_method;

/**
 * Classe abstraite définissant le Template Method
 * Le squelette de l'algorithme est défini ici, les détails dans les sous-classes
 */
public abstract class BoissonChaud {

    /**
     * TEMPLATE METHOD : définit l'algorithme général
     * Cette méthode est finale pour empêcher les sous-classes de la modifier
     */
    public final void preparerRecette() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("    PRÉPARATION DE " + getNom().toUpperCase());
        System.out.println("╚════════════════════════════════════════╝\n");

        // Étape 1 : commune à toutes les boissons
        faireBouillirEau();

        // Étape 2 : spécifique à chaque boisson (méthode abstraite)
        preparer();

        // Étape 3 : commune à toutes les boissons
        verserDansTasse();

        // Étape 4 : optionnelle, contrôlée par un hook
        if (souhaiteAjouterIngredients()) {
            ajouterIngredients();
        }

        System.out.println("\n" + getNom() + " prêt à déguster !\n");
    }

    /**
     * Étape commune : faire bouillir l'eau
     */
    private void faireBouillirEau() {
        System.out.println("Étape 1 : Faire bouillir l'eau...");
        System.out.println("   → Température : 100°C");
    }

    /**
     * Étape spécifique : préparer la boisson
     * Méthode abstraite à implémenter dans les sous-classes
     */
    protected abstract void preparer();

    /**
     * Étape commune : verser dans la tasse
     */
    private void verserDansTasse() {
        System.out.println("Étape 3 : Verser dans la tasse...");
        System.out.println("   → Boisson versée");
    }

    /**
     * Étape optionnelle : ajouter des ingrédients
     * Méthode abstraite à implémenter dans les sous-classes
     */
    protected abstract void ajouterIngredients();

    /**
     * Hook method : permet aux sous-classes de décider si elles veulent ajouter des ingrédients
     * Par défaut, retourne true (on ajoute les ingrédients)
     * Les sous-classes peuvent redéfinir cette méthode pour changer le comportement
     */
    protected boolean souhaiteAjouterIngredients() {
        return true;
    }

    /**
     * Méthode abstraite pour obtenir le nom de la boisson
     */
    protected abstract String getNom();
}