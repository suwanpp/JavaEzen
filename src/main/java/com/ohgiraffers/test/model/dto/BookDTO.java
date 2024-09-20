package com.ohgiraffers.test.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO(){}

    public BookDTO(int category, String title, String author, int bNo){
        this.category = category;
        this.title = title;
        this.author = author;
        this.bNo = bNo;
    }


    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public void setCategory(int category){
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public int getCategory(){
        return category;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "BookDTO [ bNo = " + bNo + ", category = " + category  + ", title = " + title + ", author = " + author + " ] ";

    }


}
