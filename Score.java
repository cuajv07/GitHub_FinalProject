/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java07.scoreofstudent;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Score {
    private String ID;
    private double avg;
    List<Subject1> list = new ArrayList<>(10);

    public Score(String ID, double avg) {
        this.ID = ID;
        this.avg = avg;
    }

    public Score() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Score{" + "ID=" + ID + ", avg=" + avg + ", list=" + list + '}';
    }
    
}
