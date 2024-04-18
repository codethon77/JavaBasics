package com.gfg;

public class ClassObjectDemo {
    public static void main(String[] args) {
        Lecture l1=new Lecture();
        l1.setMentor("Shahi");
        l1.setTitle("L01");
        l1.setStatus("Live");
        Lecture l2=new Lecture("Shah","L02","pending");
        System.out.println(l1);
        System.out.println(l1.numOfObjects);
        System.out.println(l2.numOfObjects);
        System.out.println(Lecture.numOfObjects);
    }

}
