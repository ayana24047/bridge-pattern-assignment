package com.example.docbridge;

// Concrete Implementor #1
// имитация локального рендеринга документа
public final class LocalRenderer implements RendererEngine {
    @Override
    public void render(String docName, String content) {
        System.out.println("[Local Renderer] Rendering " + docName + " -> " + content);
    }
}
