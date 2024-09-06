package com.suwan.section04.looping_and_branching.level01;

import java.util.Scanner;

public class A_for {

    public void sum1to10() {

        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void sum1toNum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합 : " + sum);
    }

    public void sum1toEvenNum() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0 ;

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println("1부터 " + num + "까지의 합 : " + sum);
    }

}
