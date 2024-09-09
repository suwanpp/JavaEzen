package com.teamQuiz.variable_and_operator.Application;

import java.util.Scanner;

public class wan {
    public static void main(String[] args) {

        float fahrenheit = 100.0f;
        float celcius = (float) (((5/9f*(fahrenheit-32))*100+0.5) / 100f);
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+(int)celcius);

        Scanner sc = new Scanner(System.in);
        System.out.print("공의 개수를 입력하세요 : ");
        int num = sc.nextInt();
        int result = (num%5==0) ? num/5 : (num/5)+1;
        System.out.println("필요한 상자의 개수는 : " + result);

    }
}
