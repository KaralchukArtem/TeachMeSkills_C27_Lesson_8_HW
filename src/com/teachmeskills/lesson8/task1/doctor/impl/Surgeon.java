package com.teachmeskills.lesson8.task1.doctor.impl;

import com.teachmeskills.lesson8.task1.doctor.BaseDoctor;

public class Surgeon implements BaseDoctor {


    private String name;
    private String position;
    private int age;

    public Surgeon(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    @Override
    public void treat() {
        System.out.println("Лечит хирург");
    }

    @Override
    public void showInfo() {
        System.out.println("Има врача " + name + "\nДолжность " + position + "\nВозраст " + age);
    }
}
