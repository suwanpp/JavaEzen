package com.ohgiraffers.level02.normal.book.model.dto;

public class BookDTO {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public BookDTO() {
    }

    public BookDTO(String title, String publisher, String author) {

        this.title = title;
        this.publisher = publisher;
        this.author = author;

    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this(title, publisher, author);
        this.price = price;
        this.discountRate = discountRate;

    }

    public void printInformation() {

        System.out.println("제목 : " + title + ", 출판사 : " + publisher + ", 저자 : " + author + ", 가격 : " + price + ", 할인율 : " + discountRate);

    }
}
