package com.ohgiraffers.level03.hard.emp.run;

import com.ohgiraffers.level03.hard.emp.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String name = sc.next();
        String dept = sc.next();
        String job = sc.next();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        int salary = sc.nextInt();
        double bonusPoint = sc.nextDouble();
        String phone = sc.next();
        String address = sc.next();


        EmployeeDTO emp = new EmployeeDTO();

        emp.setNumber(number);
        emp.setName(name);
        emp.setDept(dept);
        emp.setJob(job);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setSalary(salary);
        emp.setBonusPoint(bonusPoint);
        emp.setPhone(phone);
        emp.setAddress(address);

        System.out.println(emp.getNumber());
        System.out.println(emp.getName());
        System.out.println(emp.getDept());
        System.out.println(emp.getJob());
        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
        System.out.println(emp.getSalary());
        System.out.println(emp.getBonusPoint());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());


    }



}
