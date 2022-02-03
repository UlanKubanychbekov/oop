package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {



    public static void main(String[] args) {

        Nout nout = new Nout();
        nout.setName("lenovo");
        nout.setColour("krasnyi");
        nout.setMemory(512);
        nout.setCpu("windows");
        System.out.println(nout.getName()+" "+nout.getCpu()+" "+nout.getColour()+" "+nout.getMemory() +" гб");

        Nout.vkl();
        Nout.otkl();





    }
}

