package com.suwan.section04.team;

import java.util.Scanner;

public class soonB {

    public void triangle() {

        Scanner sc = new Scanner(System.in);
        System.out.print("만드려는 삼각형의 높이를 입력하세요 : ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {  // 각 줄을 출력하는 반복문  rows 만큼

            // 공백 넣기 위해
            for(int j = 0; j < rows - i -1; j++){  // j는 공백을 몇번 출력할지 설정
                System.out.print(" ");
            }

            // * 넣기
            for(int k =0; k<(2 * i + 1); k++){
                System.out.print("*");
            }

            //줄바꿈
            System.out.println();
        }
    }
}
