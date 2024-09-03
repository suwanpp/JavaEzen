package com.suwan.section02.operator;

public class Application5 {

    public static void main(String[] args) {

        int a = 10, b = 20, c = 30, d = 40;
        double a1 = (double) a;
        double b1 = (double) b;
        double c1 = (double) c;
        double d1 = (double) d;

        System.out.println(a1);

        double max = (a1 > b1) ? a1 : (b1 > c1) ? b1 : (c1 > d1) ? c1 : d1;
        double min = (a1 < b1) ? a1 : (b1 < c1) ? b1 : (c1 < d1) ? c1 : d1;

        System.out.println("최대값은 " + max + " 입니다." + " 최소값은 " + min + "입니다.");
        System.out.println("최대값과 최소값의 차이는 " + (max - min) + " 입니다.");

    }
}
