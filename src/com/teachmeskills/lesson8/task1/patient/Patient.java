package com.teachmeskills.lesson8.task1.patient;

import com.teachmeskills.lesson8.task1.doctor.BaseDoctor;

public class Patient {

    private String name;
    private String treatmentPlan;
    public BaseDoctor doctor;

    public Patient(String name) {
        this.name = name;
    }

    public void setTreatmentPlan(String plan) {
        this.treatmentPlan = plan;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setDoctor(BaseDoctor doctor) {
        this.doctor = doctor;
        doctor.treat();
    }

    public BaseDoctor showDoctor() {
        return doctor;
    }

}
