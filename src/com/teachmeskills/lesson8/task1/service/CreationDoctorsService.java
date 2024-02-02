package com.teachmeskills.lesson8.task1.service;

import com.teachmeskills.lesson8.task1.doctor.BaseDoctor;
import com.teachmeskills.lesson8.task1.doctor.impl.Dentist;
import com.teachmeskills.lesson8.task1.doctor.impl.Surgeon;
import com.teachmeskills.lesson8.task1.doctor.impl.Therapist;

public class CreationDoctorsService {

    public BaseDoctor pullDoctor(String treatmentPlan) {

        if (treatmentPlan.endsWith("dentist.")) {
            return new Dentist("Денис", "Дантист", 26);
        } else if (treatmentPlan.endsWith("surgeon.")) {
            return new Surgeon("Сара", "Хирург", 42);
        } else {
            return new Therapist("Петр","Терапевт",32);
        }

    }
}
