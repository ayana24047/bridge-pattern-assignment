package com.example.docbridge;

// Implementor (часть Bridge)
// определяет общий интерфейс для всех рендереров
public interface RendererEngine {
    void render(String docName, String content);
}
