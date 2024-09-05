package com.suwan.section04.conditional.level02;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();
        System.out.print("체중을 입력하세요 : ");
        double weight = sc.nextDouble();
        double BMI = weight / (height * height);

        if (BMI < 20) {
            System.out.println("당신의 BMI는 " + BMI + "입니다.");
            System.out.println("당신은 저체중 입니다.");
        } else if (BMI >= 20 && BMI < 25) {
            System.out.println("당신의 BMI는 " + BMI + "입니다.");
            System.out.println("당신은 정상체중 입니다.");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("당신의 BMI는 " + BMI + "입니다.");
            System.out.println("당신은 과체중 입니다.");
        } else {
            System.out.println("당신의 BMI는 " + BMI + "입니다.");
            System.out.println("당신은 비만입니다.");
        }
    }
}