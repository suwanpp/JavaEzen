package com.suwan.section03.method;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("두 수의 합은 " + sum + "입니다.");


    }
}
