package com.core;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int quantity = scan.nextInt();
        for (int i=0; i<quantity; i++) {
            courseA.add(scan.nextInt());
        }

        System.out.print("How many students for course B? ");
        quantity = scan.nextInt();
        for (int i=0; i<quantity; i++) {
            courseB.add(scan.nextInt());
        }

        System.out.print("How many students for course C? ");
        quantity = scan.nextInt();
        for (int i=0; i<quantity; i++) {
            courseC.add(scan.nextInt());
        }

        Set<Integer> students = new HashSet<>(courseA);
        students.addAll(courseB);
        students.addAll(courseC);

        System.out.println("total students: " + students.size());
    }




}
