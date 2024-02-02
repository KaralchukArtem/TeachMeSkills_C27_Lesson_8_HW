package com.teachmeskills.lesson8.task1.entity.impl;

import com.teachmeskills.lesson8.task1.entity.BaseDoctor;
import com.teachmeskills.lesson8.task1.entity.IDoctor;

public class Dentist extends BaseDoctor implements IDoctor {

    public Dentist(String name, String position, String treatmentPlan, int age) {
        super(name, position, treatmentPlan, age);
    }

    @Override
    public void treat() {
        System.out.println("План лечения врача - " + super.treatmentPlan);
    }

    @Override
    public String getTreatmentPlan() {
        return super.treatmentPlan;
    }
}
