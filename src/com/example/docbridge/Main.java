package com.example.docbridge;

// Демонстрация работы Bridge-паттерна
public class Main {
    public static void main(String[] args) {
        // создаём разные рендереры
        RendererEngine local = new LocalRenderer();
        RendererEngine cloud = new CloudRenderer();

        // создаём разные документы, но можем менять рендерер
        Document pdfLocal = new PDFDocument(local, "Report", "Q3 revenue summary");
        Document wordCloud = new WordDocument(cloud, "Resume", "Education and Skills");

        // показываем работу — 2 независимые оси изменений
        pdfLocal.render();
        wordCloud.render();
    }
}
