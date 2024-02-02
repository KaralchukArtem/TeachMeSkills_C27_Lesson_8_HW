package com.teachmeskills.lesson8.task1.doctor.impl;

import com.teachmeskills.lesson8.task1.doctor.BaseDoctor;
import com.teachmeskills.lesson8.task1.service.CreationDoctorsService;

public class Therapist implements BaseDoctor {

    private String name;
    private String position;
    private int age;

    public Therapist(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public Therapist() {};

    @Override
    public void treat() {
        System.out.println("Лечит терапевт");
    }

    @Override
    public void showInfo() {
        System.out.println("Има врача " + name + "\nДолжность " + position + "\nВозраст " + age);
    }

    public BaseDoctor getDoctor(String treatmentPlan) {
        CreationDoctorsService doctorsService = new CreationDoctorsService();
        return doctorsService.pullDoctor(treatmentPlan);
    }
}
