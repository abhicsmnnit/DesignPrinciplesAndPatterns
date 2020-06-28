package com.example.principles.srp.solution;

public class Book {
    private String name;
    private String author;
    private String text;

    public static void main(String[] args) {
        Book book = new Book();

        new PdfRenderer().render(book);
        new EPubRenderer().render(book);
        new KfxRenderer().render(book);
    }
}