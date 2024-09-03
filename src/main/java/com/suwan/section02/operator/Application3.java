package com.suwan.section02.operator;

public class Application3 {

    public static void main(String[] args) {

        float score = 86.3f;
        String result = (score>=90)? "A" : (score>=80)? "B" : (score>=70)? "C" :(score>=60)? "D" : "F";
        System.out.println("홍길동의 이번 점수등급은 " + result + "입니다.");
        /* 실수를 변수로 선언하여 점수를 저장하고,
         * 이를 정수로 변환하여 점수가 90점 이상이면 "A",
         * 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D",
         * 60점 미만이면 "F"를 출력하는 프로그램을 작성해본다.
         *
         * -- 출력 예시 --
         *
         * 홍길동의 이번 점수등급은 B입니다.
         *
         * */
    }
}