package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {


    public static void main(String[] args) {
        Student stud = new Student();
        stud.setName("Дуйшон");
        stud.setJaw(38);
        stud.setGroup("java - 5");
        System.out.println(stud.getName()+" "+stud.getJaw()+" "+stud.getGroup());

        stud.study();
        stud.play();


    }
}

