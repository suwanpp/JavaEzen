package com.suwan.section02.operator;

public class Application4 {

    public static void main(String[] args) {

        int age1 = 20;
        int age2 = 18;

        String result1 = (age1>19)? "성인입니다" : "미성년자입니다";
        String result2 = (age2>19)? "성인입니다" : "미성년자입니다";

        System.out.println("age1은 " + result1);
        System.out.println("age2는 " + result2);


    }
}
