package com.suwan.section06.abstraction;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        remoteControl remote = new remoteControl();


        while(true){
            System.out.println("티비 동작 프로그램");
            System.out.println("1. 전원켜기");
            System.out.println("2. 소리 키우기");
            System.out.println("3. 음소거 버튼 누르기");
            System.out.println("4. 채널 올리기 ");
            System.out.println("5. 채널 0번으로 만들기");
            System.out.println("6. 전원 끄기");
            System.out.println("9. 프로그램 종료하기");
            int no = sc.nextInt();

            switch (no){     // case에 break;를 안넣으면 다음 케이스도 계속 실행
                case 1 : remote.turnOn(); break;
                case 2 : remote.volumeUp(); break;
                case 3 : remote.mute(); break;
                case 4 : remote.channelUp(); break;
                case 5 : remote.channelZero(); break;
                case 6 : remote.turnOff(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다."); break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다."); break;
            }

            if(no==9){
                break;
            }
            System.out.println(" ");
        }
    }
}
