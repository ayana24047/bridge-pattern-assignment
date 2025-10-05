package com.example.docbridge;

// Concrete Implementor #2
// имитация рендеринга через облачный сервис
public final class CloudRenderer implements RendererEngine {
    @Override
    public void render(String docName, String content) {
        System.out.println("[Cloud Renderer] Uploading and rendering " + docName + " -> " + content);
    }
}
