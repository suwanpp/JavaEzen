package com.suwan.section01.literal_variable;

public class Application1 {

    public static void main(String[] args) {


        int a = 20;
        int b = 30;

        int sum = a + b;
        int minus = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("더하기 결과 " + sum);
        System.out.println("빼기 결과 " + minus);
        System.out.println("곱하기 결과 " + multi);
        System.out.println("나누기 결과 " + div);
        System.out.println("나누기한 나머지 " + mod);
        /* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */
    }
}