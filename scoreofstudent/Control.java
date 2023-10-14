/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java07.scoreofstudent;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Control {

    static Scanner sc = new Scanner(System.in);

    static <E> void addLStu(LinkedList<E> list, E student) {

        list.addLast(student);

    }

    static <E> void addFStu(LinkedList<E> list, E student) {
        list.addFirst(student);

    }

    static <E> void addIn(LinkedList<E> list, E student, int posit) {
        
        if (posit > 0 && posit < list.size()) {
            list.add(posit, student);
        }

    }

    static <E> void deletePo(LinkedList<E> list, E student) {
        int posit = sc.nextInt();
        Iterator<E> control = list.iterator();
        while (control.hasNext()) {
            E item = control.next();
            if(item.equals(list.get(posit))) {
                control.remove();
            }
        }
        
    }
    static void fixName(Student student) {
        student.setName(sc.nextLine());
    }
    static void fixDOB(Student student) {
        student.setDateOfBirth(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
    static void fixClass(Student student) {
        student.setClassOfStudent(sc.nextLine());
    }
            
    static void fixScoreCS(Student student) {
        student.subject.setComputerScience(sc.nextDouble());
    }
    static void fixScoreGP1(Student student) {
        student.subject.setGeneralPhysics1(sc.nextDouble());
    }
    static void fixScoreGP2(Student student) {
        student.subject.setGeneralPhysics2(sc.nextDouble());
    }
    static void fixScoreHM1(Student student) {
        student.subject.setHigherMathematics1(sc.nextDouble());
    }
    static void fixScoreHM2(Student student) {
        student.subject.setHigherMathematics2(sc.nextDouble());
    }
    static void fixScoreHM3(Student student) {
        student.subject.setHigherMathematics3(sc.nextDouble());
    }
    static void fixScorePhilo(Student student) {
        student.subject.setPhilosophy(sc.nextDouble());
    }
    static void fixScorePE(Student student) {
        student.subject.setPoliticalEconomic(sc.nextDouble());
    }
    static void fixScoreSoc(Student student) {
        student.subject.setSocialism(sc.nextDouble());
    }
    static void fixScoreSS(Student student) {
        student.subject.setSoftSkills(sc.nextDouble());
    }
  
    
}



