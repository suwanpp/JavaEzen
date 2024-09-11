package com.ohgiraffers.level02.normal.student.model.dto;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public StudentDTO() {
    } // 기본생성자

    public StudentDTO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public void printInformation() {
        System.out.println("학년 : " + grade + ", 반 : " + classroom + ", 이름 : " + name + ", 키 : " + height + ", 성별 : " + gender);

    }
}
