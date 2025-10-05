package com.example.docbridge;

// Refined Abstraction #2
// реализует поведение для Word-документа
public final class WordDocument extends Document {
    public WordDocument(RendererEngine renderer, String name, String content) {
        super(renderer, name, content);
    }

    @Override
    public void render() {
        renderer.render(name + ".docx", content);
    }
}
