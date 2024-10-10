package com.example.bibliotecadigitalapp;

public class Book {
    private String title;
    private String author;
    private int coverImageResId; // Usamos un entero para el recurso de imagen

    public Book(String title, String author, int coverImageResId) {
        this.title = title;
        this.author = author;
        this.coverImageResId = coverImageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCoverImageResId() {
        return coverImageResId;
    }

}
