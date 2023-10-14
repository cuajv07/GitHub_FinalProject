/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java07.scoreofstudent;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Model {

    static Scanner sc = new Scanner(System.in);
    static List<Student> student = new ArrayList<>();
    static List<Score> score = new ArrayList<>();

    static void inputInfoSub(Subject1 e) {
        System.out.println("Nhap ten mon: ");
        e.setNameOfSubject(sc.nextLine());
        System.out.println("Nhap ma mon: ");
        e.setCodeOfSubject(sc.nextLine());
        System.out.println("Nhap so tin chi: ");
        e.setCreditHours(sc.nextInt());
        System.out.println("Nhap diem: ");
        e.setScore(sc.nextDouble());
    }

    static void inputInfoStd(Student e) {

        System.out.println("Nhap ID: ");
        e.setID(sc.nextLine());
        System.out.println("Nhap ten: ");
        e.setName(sc.nextLine());
        System.out.println("Nhap ten lop: ");
        e.setClassOfStudent(sc.nextLine());
        System.out.println("Nhap ngay thang nam sinh: ");
        int dayOfBirth = sc.nextInt();
        int monthOfBirth = sc.nextInt();
        int yearOfBirth = sc.nextInt();
        e.setDateOfBirth(LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth));
        sc.nextLine();
        System.out.println("Nhap que quan: ");
        e.setHomeTown(sc.nextLine());
    }

    static void inputInfoSco(Score e) {
        e = new Score();
        System.out.println("Nhap ID: ");
        e.setID(sc.nextLine());
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            Subject1 a = new Subject1();
            inputInfoSub(a);
            e.list.add(a);
            sc.nextLine();

        }
        for (int i = 1; i <= 10; i++) {
            avg = avg + e.list.get(i).getScore();
        }
        e.setAvg(avg / 10.0);
    }


    static void option() {

        int n;
        do {
            System.out.println("Hay chon: ");
            System.out.println("1. Tao danh sach sinh vien");
            System.out.println("2. Thoat");
            System.out.println("3. Hien thi thong tin sinh vien");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Ban muon tao danh sach gom bao nhieu sinh vien?");
                    int numberOfStudent = sc.nextInt();
                    while (numberOfStudent <= 0) {
                        System.out.println("Loi! Moi ban nhap lai");
                        numberOfStudent = sc.nextInt();
                    }
                    sc.nextLine();
                    System.out.println("Moi ban nhap thong tin cua cac sinh vien");
                    for (int i = 0; i < numberOfStudent; i++) {
                        Student e = new Student();
                        Score a = new Score();
                        inputInfoStd(e);
                        inputInfoSco(a);
                        student.add(e);
                        score.add(a);                        

                    }
                    break;

                case 2:
                    System.exit(0);
                    break;
                case 3:
                    for (Student item : student) {
                        System.out.println(item.toString());
                        ;
                    }
                    break;

            }

        } while (n != 2);

    }
    public static void main(String[] args) {
        option();
    }

}
