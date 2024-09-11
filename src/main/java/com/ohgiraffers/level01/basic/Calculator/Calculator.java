package com.ohgiraffers.level01.basic.Calculator;

public class Calculator {

    public static void main(String[] args) {

    }

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {

        return (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

    }

    public int checkMaxNumber(int a, int b) {

        return Math.max(a, b);
    }

    public int sumTwoNumbers(int a, int b) {

        return a + b;
    }

    public int minusTwoNumber(int a, int b) {

        return Math.abs(a - b);
    }


}
