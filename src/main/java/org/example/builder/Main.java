package org.example.builder;

/**
 * Classe Main pour tester l'implémentation du pattern Builder.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Test du Pattern Builder ===\n");

        // Création du directeur
        ReportDirector director = new ReportDirector();

        System.out.println("1. Construction d'un rapport PDF complet");
        System.out.println("--------------------------------------------------");

        // Création d'un rapport PDF
        ReportBuilder pdfBuilder = new PdfReportBuilder();
        director.setBuilder(pdfBuilder);
        director.constructReport();
        Report pdfReport = pdfBuilder.getReport();
        pdfReport.show();

        System.out.println("\n2. Construction d'un rapport HTML complet");
        System.out.println("--------------------------------------------------");

        // Création d'un rapport HTML
        ReportBuilder htmlBuilder = new HtmlReportBuilder();
        director.setBuilder(htmlBuilder);
        director.constructReport();
        Report htmlReport = htmlBuilder.getReport();
        htmlReport.show();

        System.out.println("\n3. Construction d'un rapport PDF simplifié");
        System.out.println("--------------------------------------------------");

        // Création d'un rapport PDF simplifié (sans graphique)
        ReportBuilder pdfBuilder2 = new PdfReportBuilder();
        director.setBuilder(pdfBuilder2);
        director.constructSimpleReport();
        Report pdfReportSimple = pdfBuilder2.getReport();
        pdfReportSimple.show();

        System.out.println("\n4. Construction manuelle d'un rapport personnalisé");
        System.out.println("--------------------------------------------------");

        // Construction manuelle sans director
        ReportBuilder customBuilder = new HtmlReportBuilder();
        customBuilder.buildTitle("Rapport personnalisé");
        customBuilder.buildTable("Données spécifiques");
        customBuilder.buildConclusion("Conclusion personnalisée");
        Report customReport = customBuilder.getReport();
        customReport.show();

        System.out.println("==================================================");
        System.out.println("✓ Le pattern Builder permet de :");
        System.out.println("  - Construire des objets complexes étape par étape");
        System.out.println("  - Créer différentes représentations du même objet");
        System.out.println("  - Isoler la logique de construction du code client");
    }
}