package org.example.builder;

/**
 * Builder concret pour créer un rapport au format PDF.
 * Toutes les lignes sont préfixées par [PDF].
 */
public class PdfReportBuilder implements ReportBuilder {
    private Report report;

    /**
     * Constructeur qui initialise un nouveau rapport.
     */
    public PdfReportBuilder() {
        this.report = new Report();
        this.report.setType("PDF");
    }

    @Override
    public void buildTitle(String title) {
        String pdfTitle = "[PDF] ==================\n" +
                "[PDF] " + title + "\n" +
                "[PDF] ==================";
        report.setTitle(pdfTitle);
    }

    @Override
    public void buildTable(String tableData) {
        String pdfTable = "\n[PDF] --- TABLEAU ---\n" +
                "[PDF] " + tableData + "\n" +
                "[PDF] -----------------";
        report.setTable(pdfTable);
    }

    @Override
    public void buildChart(String chartData) {
        String pdfChart = "\n[PDF] --- GRAPHIQUE ---\n" +
                "[PDF] " + chartData + "\n" +
                "[PDF] -------------------";
        report.setChart(pdfChart);
    }

    @Override
    public void buildConclusion(String conclusion) {
        String pdfConclusion = "\n[PDF] --- CONCLUSION ---\n" +
                "[PDF] " + conclusion + "\n" +
                "[PDF] --------------------";
        report.setConclusion(pdfConclusion);
    }

    @Override
    public Report getReport() {
        return this.report;
    }
}