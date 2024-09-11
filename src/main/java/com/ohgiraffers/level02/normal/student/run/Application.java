package com.ohgiraffers.level02.normal.student.run;

import com.ohgiraffers.level02.normal.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("학년을 입력하세요 : ");
        int grade = sc.nextInt();

        System.out.print("반을 입력하세요 : ");
        int classroom = sc.nextInt();

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();

        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        StudentDTO student = new StudentDTO(grade, classroom, name, height, gender);

        student.printInformation();
    }
}
