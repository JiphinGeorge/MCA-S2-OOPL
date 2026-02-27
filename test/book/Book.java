package book;

import library.LibraryItem;

public class Book implements LibraryItem {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void borrowItem() {
        System.out.println("Book borrowed: " + title);
    }

    public void returnItem() {
        System.out.println("Book returned: " + title);
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}