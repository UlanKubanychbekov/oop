package com.company;

public class TriUgolnik {

    void area(int a, int b, int c) {

        double sum = (a + b + c) / 2;
        double summ = (sum * (sum - a) * (sum - b) * (sum - c));
        System.out.println(Math.sqrt(summ));
    }
}

