package com.suwan.section03.method;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        // -50부터 50까지의 난수를 발생시키는 함수
        Random random = new Random(); // random 객체 생성, java.util.Random import 필수

        int random1 = random.nextInt(101) - 50;
        System.out.println("random1 = " + random1);

        int random2 = (int) (Math.random() * 101) - 50;
        System.out.println("random2 = " + random2);
    }
}
