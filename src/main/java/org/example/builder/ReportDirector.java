package org.example.builder;

/**
 * Classe Director qui orchestre le processus de construction.
 * Elle définit l'ordre des étapes de construction.
 */
public class ReportDirector {
    private ReportBuilder builder;

    /**
     * Définit le builder à utiliser.
     *
     * @param builder le builder concret
     */
    public void setBuilder(ReportBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construit un rapport complet en suivant un processus défini.
     * Cette méthode définit l'ordre et les étapes de construction.
     */
    public void constructReport() {
        builder.buildTitle("Rapport annuel des ventes 2024");
        builder.buildTable("CA: 1.5M€ | Croissance: +15% | Clients: 250");
        builder.buildChart("Graphique en barres montrant l'évolution trimestrielle");
        builder.buildConclusion("Excellent résultat, objectifs dépassés. Poursuivre la stratégie.");
    }

    /**
     * Construit un rapport simplifié (sans graphique).
     */
    public void constructSimpleReport() {
        builder.buildTitle("Rapport mensuel - Mars 2024");
        builder.buildTable("CA: 125K€ | Nouvelles ventes: 18");
        builder.buildConclusion("Performance stable, conforme aux prévisions.");
    }
}