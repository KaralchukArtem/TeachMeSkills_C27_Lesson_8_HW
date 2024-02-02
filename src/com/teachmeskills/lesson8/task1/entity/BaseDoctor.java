package com.teachmeskills.lesson8.task1.entity;

public class BaseDoctor {

    private String name;
    private String position;

    protected String treatmentPlan;
    private int age;


    public BaseDoctor(String name, String position, String treatmentPlan, int age) {
        this.name = name;
        this.position = position;
        this.treatmentPlan = treatmentPlan;
        this.age = age;
    }

    public BaseDoctor() {}

    public void showInfo() {
        System.out.println("Има врача " + this.name + "\nДолжность " + this.position + "\nВозраст " + this.age);
    }


}
