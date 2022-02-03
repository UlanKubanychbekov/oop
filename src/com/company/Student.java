package com.company;

public class Student {

    private String name;
    private String group;
    private int jaw;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getJaw() {
        return jaw;
    }

    public void setJaw(int jaw) {
        if (jaw>0)
        this.jaw = jaw;
        {

        }
    }

    void study (){
       System.out.println("окуп жатат");

   }void play (){
        System.out.println("ойноп жатат");
    }
}
