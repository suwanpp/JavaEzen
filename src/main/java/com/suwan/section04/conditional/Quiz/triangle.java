package com.suwan.section04.conditional.Quiz;

import java.util.Scanner;

public class triangle {

    public void typeOfTriangle() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 변의 길이를 입력 하세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 변의 길이를 입력 하세요 : ");
        int second = sc.nextInt();
        System.out.print("세 번째 변의 길이를 입력 하세요 : ");
        int third = sc.nextInt();

        if (first == second && second == third) {
            System.out.println("정삼각형 입니다.");
        } else if ((first == second && first != third) || (first == third && first != second)) {
            System.out.println("이등변삼각형 입니다.");
        } else {
            System.out.println("부등변삼각형 입니다.");
        }

    }
}
