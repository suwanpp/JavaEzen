package com.suwan.section01.literal_variable;

public class Application5 {

    public static void main(String[] args) {

        float a = 51.3f;
        a = (int) a;

        String result = (a < 100) ? "min" : "max";
        System.out.println("a의 값 : " + result);

    }
}
