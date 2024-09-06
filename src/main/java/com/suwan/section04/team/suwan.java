package com.suwan.section04.team;

import java.util.Scanner;

public class suwan {

    public void factorial() {

        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼을 계산할 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= num ; i++){
            sum *= i;
        }
        System.out.println("입력하신 숫자의 팩토리얼은 " + sum + "입니다.");

    }



}
