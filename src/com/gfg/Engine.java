package com.gfg;

public class Engine {
    private  Integer cc;

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public Engine(Integer cc, String name) {
        this.cc = cc;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + cc +
                ", name='" + name + '\'' +
                '}';
    }
}
