package com.bookstore;

public class Book {
    private long isbnNumber;
    private String tittle;
    private String description;
    private int price;

    private Author author;

    public void display(){
        System.out.println("isbnNumber = " + isbnNumber);
        System.out.println("tittle = " + tittle);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
    }

    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
