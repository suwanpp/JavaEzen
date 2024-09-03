package com.suwan.section01.literal_variable;

public class Application3 {

    public static void main(String[] args) {

        float kor = 80.5f;
        float math = 50.6f;
        float eng = 70.8f;

        int sum = (int) (kor + math + eng);
        int avg = (int) (sum / 3);

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */
    }
}