package com.teamQuiz.variable_and_operator.Application;

import java.util.Scanner;

public class bin {

    public static void main(String[] args) {

        int a = 400;
        byte b = (byte) a;
        System.out.println("b = " + b);

        char ch = 'a';
        int num = (int) ch;
        System.out.println(num);

        Scanner sc = new Scanner(System.in);
        System.out.print("장바구니에 담긴 총 금액 : ");
        int num2 = sc.nextInt();
        double disc1 = num2 * 0.8;
        double disc2 = num2 * 0.9;
        double disc3 = num2 * 0.95;

        double result = (num2 >= 500000) ? disc1 : (num2 >= 300000) ? disc2 : (num2 >= 100000) ? disc3 : num2;
        System.out.println("할인 후의 가격은 : " + (int) result);
        double discount = (1 - (result / num2)) * 100;
        System.out.println("할인율은 : " + discount + "% 입니다.");
    }
}
