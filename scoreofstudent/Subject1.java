/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java07.scoreofstudent;

/**
 *
 * @author Admin
 */
public class Subject1 {
    private String nameOfSubject;
    private String codeOfSubject;
    private int creditHours;
    private double score;

    public Subject1(String nameOfSubject, String codeOfSubject, int creditHours, double score) {
        this.nameOfSubject = nameOfSubject;
        this.codeOfSubject = codeOfSubject;
        this.creditHours = creditHours;
        this.score = score;
    }

    public Subject1() {
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getCodeOfSubject() {
        return codeOfSubject;
    }

    public void setCodeOfSubject(String codeOfSubject) {
        this.codeOfSubject = codeOfSubject;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject1{" + "nameOfSubject=" + nameOfSubject + ", codeOfSubject=" + codeOfSubject + ", creditHours=" + creditHours + ", score=" + score + '}';
    }
    

    

}
