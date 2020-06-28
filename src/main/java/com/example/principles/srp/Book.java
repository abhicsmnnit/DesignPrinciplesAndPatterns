package com.example.principles.srp;

public class Book {
    private String name;
    private String author;
    private String text;

    void renderTextAsPdf() {
        // ...
    }

    void renderTextAsEPub() {
        // ...
    }

    void renderTextAsKfx() {
        // ...
    }

    public static void main(String[] args) {
        Book b = new Book();

        b.renderTextAsPdf();
        b.renderTextAsEPub();
        b.renderTextAsKfx();
    }
}