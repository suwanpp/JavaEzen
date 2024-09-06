package com.suwan.section04.looping_and_branching.level02;

import java.util.Scanner;

public class B_for {

    public void stringIndex(){

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            System.out.println(i + " : " + ch);
        }
    }

    public void alphabet(){

        for (char i = 97 ; i <= 122 ; i++){
            System.out.print(i);
        }
    }

    public void alphabet2(){
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i);
        }

    }


    public void subak(){

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            if(i % 2 != 0){
                System.out.print("수");
            } else {
                System.out.print("박");
            }
        }
    }
}
