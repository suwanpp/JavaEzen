package com.suwan.section01.literal_variable;

public class Application4 {

    public static void main(String[] args) {
        // Pi를 상수로 3.14로 설정하고 초기화하세요.  반지름을 5로 선언 및 초기화 한 후 원의 넓이를 구하세요

        final double pi = 3.14;

        double radius = 5.0;
        double area = pi * radius * radius;

        System.out.println("원의 넓이는 " + area + "입니다.");


    }
}
