package org.example.builder;

/**
 * Builder concret pour créer un rapport au format HTML.
 * Utilise des balises HTML pour chaque élément.
 */
public class HtmlReportBuilder implements ReportBuilder {
    private Report report;

    /**
     * Constructeur qui initialise un nouveau rapport.
     */
    public HtmlReportBuilder() {
        this.report = new Report();
        this.report.setType("HTML");
    }

    @Override
    public void buildTitle(String title) {
        String htmlTitle = "<html>\n" +
                "  <head><title>Rapport</title></head>\n" +
                "  <body>\n" +
                "    <h1>" + title + "</h1>";
        report.setTitle(htmlTitle);
    }

    @Override
    public void buildTable(String tableData) {
        String htmlTable = "    <div class='table'>\n" +
                "      <h2>Tableau de données</h2>\n" +
                "      <table border='1'>\n" +
                "        <tr><td>" + tableData + "</td></tr>\n" +
                "      </table>\n" +
                "    </div>";
        report.setTable(htmlTable);
    }

    @Override
    public void buildChart(String chartData) {
        String htmlChart = "    <div class='chart'>\n" +
                "      <h2>Graphique</h2>\n" +
                "      <div class='chart-container'>" + chartData + "</div>\n" +
                "    </div>";
        report.setChart(htmlChart);
    }

    @Override
    public void buildConclusion(String conclusion) {
        String htmlConclusion = "    <div class='conclusion'>\n" +
                "      <h2>Conclusion</h2>\n" +
                "      <p>" + conclusion + "</p>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>";
        report.setConclusion(htmlConclusion);
    }

    @Override
    public Report getReport() {
        return this.report;
    }
}