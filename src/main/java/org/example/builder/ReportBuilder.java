package org.example.builder;

/**
 * Interface Builder définissant les étapes de construction d'un rapport.
 * Chaque builder concret implémentera ces méthodes différemment.
 */
public interface ReportBuilder {
    /**
     * Ajoute un titre au rapport.
     */
    void buildTitle(String title);

    /**
     * Ajoute un tableau au rapport.
     */
    void buildTable(String tableData);

    /**
     * Ajoute un graphique au rapport.
     */
    void buildChart(String chartData);

    /**
     * Ajoute une conclusion au rapport.
     */
    void buildConclusion(String conclusion);

    /**
     * Retourne le rapport construit.
     *
     * @return le rapport final
     */
    Report getReport();
}