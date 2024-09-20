package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.comparator.AscCategory;
import com.ohgiraffers.test.model.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    // 생성자
    public BookManager() {
//        bookList = new ArrayList<BookDTO>(); ??
        bookList = new ArrayList<>();
    }

    // 도서 추가
    public void addBook(BookDTO book) {
        bookList.add(book); // bookList에 도서 추가
    }

    // 도서 삭제
    public void deleteBook(int index) {

        if (index >= 0 && index < bookList.size()) {

            bookList.remove(index);

        } else {
            System.out.println("삭제할 도서가 존재하지 않습니다.");
        }
    }

    // 도서 검색
    public int searchBook(String bTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(bTitle)) {
                return i;
            }
        }
        return -1; // 없으면 -1 리턴
    }

    public void printBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            System.out.println(bookList.get(index));
//            System.out.println(bookList.get(index));
        } else {
            System.out.println("조회힌 도서가 존재하지 않음.");
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {

        if (select == 1) {
            Collections.sort(bookList, new AscCategory());
        }
        else if (select == 2) {
            Collections.sort(bookList, new DescCategory());
        } else {
            System.out.println("번호를 잘못 입력하였습니다.");
        }

        ArrayList<BookDTO> sortedList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            sortedList.add(bookList.get(i));
        }
        return sortedList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book);
        }

    }

}
