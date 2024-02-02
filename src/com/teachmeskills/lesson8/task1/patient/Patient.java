package com.teachmeskills.lesson8.task1.patient;

import com.teachmeskills.lesson8.task1.entity.IDoctor;

public class Patient {

    private String name;
    private String treatmentPlan;
    private int age;
    private IDoctor doctor;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
        this.treatmentPlan = doctor.getTreatmentPlan();
    }

    public void showInfoDoctor() {
        this.doctor.treat();
        this.doctor.showInfo();
    }

    public void showInfoPatient() {
        System.out.println("Има пациента " + this.name + "\nВозраст " + this.age + "\nПлан лечения у пациента " + this.treatmentPlan);
    }
}
