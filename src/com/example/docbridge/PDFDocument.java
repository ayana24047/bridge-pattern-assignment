package com.example.docbridge;

// Refined Abstraction #1
// реализует поведение для PDF-документа
public final class PDFDocument extends Document {
    public PDFDocument(RendererEngine renderer, String name, String content) {
        super(renderer, name, content);
    }

    @Override
    public void render() {
        renderer.render(name + ".pdf", content);
    }
}

