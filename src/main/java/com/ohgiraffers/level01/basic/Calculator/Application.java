package com.ohgiraffers.level01.basic.Calculator;

public class Application {

    public static void main(String[] args) {


        Calculator app1 = new Calculator();

        // 1번
        app1.checkMethod();

        // 2번
        int sum1to10 = app1.sum1to10();
        System.out.println("1부터 10까지의 합 : " + sum1to10);

        // 3번
        int check = app1.checkMaxNumber(10, 20);
        System.out.println("두 수 중 큰 수는 " + check + "이다.");

        // 4번
        int sum = app1.sumTwoNumbers(10, 20);
        System.out.println("10과 20의 합은 : " + sum);

        // 5번
        int minus = app1.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차는 : " + minus);

    }

}
