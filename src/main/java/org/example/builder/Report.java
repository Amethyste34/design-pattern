package org.example.builder;

/**
 * Classe représentant le produit final : un rapport.
 * Cette classe contient toutes les parties d'un rapport.
 */
public class Report {
    private String title;
    private String table;
    private String chart;
    private String conclusion;
    private String type;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setChart(String chart) {
        this.chart = chart;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Affiche le rapport complet.
     */
    public void show() {
        System.out.println("========================================");
        System.out.println("         RAPPORT " + type.toUpperCase());
        System.out.println("========================================");
        System.out.println(title);
        System.out.println(table);
        System.out.println(chart);
        System.out.println(conclusion);
        System.out.println("========================================\n");
    }
}