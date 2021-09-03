package com.wy.entity;

public class School {
    private String sname;
    private int age;

    public School(String sname, int age) {
        this.sname = sname;
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public School(String sname) {
        this.sname = sname;
    }

    public School() {
    }
}
