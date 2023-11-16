package com.practice6;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public Book(String title, String author, String isbn, double price){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.price=price;
    }

    public void displayBookInfo(){
        System.out.println("title "+getTitle());
        System.out.println("author "+getAuthor());
        System.out.println("isbn "+getIsbn());
        System.out.println("price "+getPrice());
    }

    public static void main(String[] args) {
        Book Sample = new Book("How to talk to anyone","RussellNewton","123ES",1000.0);
            Sample.displayBookInfo();
            System.out.println("Initial Book Details");
            Sample.setIsbn("143ED");
            System.out.println("\nUpdated Book Details");
            Sample.displayBookInfo();
    }
}
