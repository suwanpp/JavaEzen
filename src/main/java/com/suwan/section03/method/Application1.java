package com.suwan.section03.method;

// Main.java
public class Application1 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // 각 연산 수행 및 결과 출력
        System.out.println("덧셈 " + calc.add(13.1,12.6));
        System.out.println("뺄셈 " + calc.minus(73.1,84.8));
        System.out.println("곱셈 " + calc.multi(10.8,0.9));
        System.out.println("나눗셈 " + calc.divide(16.8,2.6));

    }
}