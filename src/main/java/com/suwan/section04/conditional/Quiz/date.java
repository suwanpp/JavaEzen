package com.suwan.section04.conditional.Quiz;

import java.util.Scanner;

public class date {

    public void checkDate() {

        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();
        System.out.print("일을 입력하세요 : ");
        int day = sc.nextInt();

        if ((month < 1 || month > 12) || (day < 1 || (day > 31) || (month == 2 && day > 29))) {
            System.out.println("잘못된 날짜입니다. ");
        } else {
            if (month == 12 && day == 25) {
                System.out.println("크리스마스입니다.");
            } else if (month == 10 && day == 31) {
                System.out.println("할로윈입니다.");
            } else if (month == 7 && day == 17) {
                System.out.println("제헌절입니다.");
            } else {
                if (month >= 3 && month <= 5) {
                    System.out.println("봄입니다.");
                } else if (month >= 6 && month <= 8) {
                    System.out.println("여름입니다.");
                } else if (month >= 9 && month <= 11) {
                    System.out.println("가을입니다.");
                } else {
                    System.out.println("겨울입니다.");
                }
            }
        }

    }

}
