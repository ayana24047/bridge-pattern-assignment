# Assignment 4 — Bridge Pattern

**Student:** Ayana  
**Course:** Design Patterns  
**Date:** October 2025  

---

## 📘 Project Overview

This project demonstrates the **Bridge Design Pattern** using Java.  
The topic: **Document Rendering System**, where different document types (PDF, Word) can use different rendering engines (Local, Cloud).  

The Bridge pattern separates **abstraction** (Document) from **implementation** (RendererEngine),  
allowing both to evolve **independently**.

---

## 🧩 Class Structure

| Type | Class | Description |
|------|--------|-------------|
| **Abstraction** | `Document` | Holds a reference to `RendererEngine` |
| **Refined Abstractions** | `PDFDocument`, `WordDocument` | Specific document types |
| **Implementor** | `RendererEngine` | Interface defining render operations |
| **Concrete Implementors** | `LocalRenderer`, `CloudRenderer` | Different rendering strategies |
| **Demo** | `Main` | Demonstrates how Bridge works |


