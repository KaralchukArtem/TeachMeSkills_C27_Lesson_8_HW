package com.teachmeskills.lesson8.task1.entity.impl;

import com.teachmeskills.lesson8.task1.entity.BaseDoctor;
import com.teachmeskills.lesson8.task1.entity.IDoctor;

public class Therapist extends BaseDoctor implements IDoctor {


    public Therapist(String name, String position,String treatmentPlan, int age) {
        super(name, position,treatmentPlan, age);
    }

    public Therapist(){};

    @Override
    public void treat() {
        System.out.println("План лечения врача - " + super.treatmentPlan);
    }

    @Override
    public String getTreatmentPlan() {
        return super.treatmentPlan;
    }
    public IDoctor assignDoctor(int code) {
        String plan;
        switch (code) {
            case 1:
                plan = "лечение как у дантиста";
                return new Dentist("Денис", "Дантист",plan, 26);
            case 2:
                plan = "лечение как у хирурга";
                return new Surgeon("Сара", "Хирург",plan, 42);
            default:
                plan = "лечение как у терапевта";
                return new Therapist("Петр","Терапевт",plan,32);
        }

    }
}
