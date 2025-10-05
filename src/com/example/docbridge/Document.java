package com.example.docbridge;

import java.util.Objects;

// Abstraction (Bridge)
// хранит ссылку на RendererEngine и делегирует ему рендеринг
public abstract class Document {
    protected final RendererEngine renderer;
    protected final String name;
    protected final String content;

    protected Document(RendererEngine renderer, String name, String content) {
        this.renderer = Objects.requireNonNull(renderer, "renderer must not be null");
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.content = Objects.requireNonNull(content, "content must not be null");
    }

    // каждая конкретная реализация документа сама решает,
    // как именно использовать renderer
    public abstract void render();

    public String getName() { return name; }
    public String getContent() { return content; }
}
