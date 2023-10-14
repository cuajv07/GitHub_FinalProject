/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.actvn.java07.scoreofstudent;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Student {

    private String homeTown;
    private String ID;
    private String name;
    private String classOfStudent;
    private LocalDate dateOfBirth;
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    //Subject subject = new Subject();

    

    public Student(String homeTown, String ID, String name, String classOfStudent, LocalDate dateOfBirth) {
        this.homeTown = homeTown;
        this.ID = ID;
        this.name = name;
        this.classOfStudent = classOfStudent;
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" + "homeTown=" + homeTown + ", ID=" + ID + ", name=" + name + ", classOfStudent=" + classOfStudent + ", dateOfBirth=" + dateOfBirth + '}';
    }
    
    
}


