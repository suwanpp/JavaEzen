package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager(); // 책 관리를 담당할 BookManager 객체

    public void menu() {


        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 후 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("메뉴 번호 선택:  ");

            int choice = sc.nextInt(); // 메뉴 번호 입력 받음

            switch (choice) {
                case 1:
                    bm.addBook(inputBook()); // 도서 추가
                    break;
                case 2:
                    System.out.print("정렬 방식을 선택하세요 (1. 오름차순, 2. 내림차순) : ");
                    int sortType = sc.nextInt();
                    ArrayList<BookDTO> sortedList = bm.sortedBookList(sortType);
                    bm.printBookList(sortedList); // 정렬 후 출력
                    break;
                case 3:
                    System.out.print("삭제할 도서 번호를 입력하세요 : ");
                    int deleteIndex = sc.nextInt();
                    bm.deleteBook(deleteIndex); // 도서 삭제
                    break;
                case 4:
                    System.out.print("검색할 도서 제목을 입력하세요 : ");
                    String searchTitle = sc.next(); // 검색할 도서 제목 입력
                    int index = bm.searchBook(searchTitle);
                    bm.printBook(index); // 도서 검색
                    break;
                case 5:
                    bm.displayAll(); // 전체 도서 출력
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return; // 프로그램 종료
                default:
                    System.out.print("잘못된 입력입니다. 다시 선택해주세요.");

            }
        }
    }

    // 사용자가 입력한 도서 정보를 받아오는 메서드
    public BookDTO inputBook() {

        System.out.print("도서 번호 :  ");
        int bNo = sc.nextInt();

        System.out.print("도서 제목 :  ");
        String title = sc.next();

        System.out.print("도서 장르 (1.인문 / 2.자연과학 / 3.의료 / 4.기타) :  ");
        int category = sc.nextInt();

        System.out.print("도서 저자 :  ");
        String author = sc.next();

        return new BookDTO(category,title, author, bNo); // 입력받은 값을 바탕으로 객체 생성 후 리턴
    }

    // 도서 제목을 입력받는 메서드
    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        return sc.next(); //
    }
}
