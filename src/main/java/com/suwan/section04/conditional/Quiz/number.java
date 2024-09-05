package com.suwan.section04.conditional.Quiz;

import java.util.Scanner;

public class number {

    public void num1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("100 이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num >= 100) {
            if (num % 2 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else if (num > 0 && num < 100) {
            System.out.println("100 이상의 양수를 입력하세요 ");
        }
    }
}
