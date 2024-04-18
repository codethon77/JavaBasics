package com.gfg;

public class Teacher extends Person{
    String Subject;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Teacher(String subject) {
        Subject = subject;
    }

    public Teacher() {
    }

    public void walk()
    {
        System.out.println(getName()+", teacher of "+Subject+" is waking");
    }
}
