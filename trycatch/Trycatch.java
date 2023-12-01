/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.actvn.java07.trycatch;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Trycatch {
    static Scanner sc = new Scanner (System.in);
    static void input(String[] a,String[] b ) {
        for (int i = 0; i<a.length;i++) {
            a[i] = sc.nextLine();
        }
        sc.nextLine();        
        for (int i = 0;i<b.length;i++) {
            b[i] = sc.nextLine();
        }
        
    }
    static void output(String[] a, String [] b) {
        for (String a1 : a) {
            System.out.print(a1 + " ");
        }
        
        for (String b1 : b) {
            System.out.print(b1+" ");
        }
    }
    static void compare(String[] a, String[] b) {
        
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];
        input(a, b);
        sc.nextLine();
        output(a, b);
        
    }
}
