package com.teachmeskills.lesson8.task1.run;

import com.teachmeskills.lesson8.task1.doctor.impl.Therapist;
import com.teachmeskills.lesson8.task1.patient.Patient;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        String plan;
        int code;

        Patient patient = new Patient("Tema");
        Therapist therapist = new Therapist();

        System.out.println("Выберте план лечения 1 или 2 : ");
        Scanner scanner = new Scanner(System.in);
        code = scanner.nextInt();

        switch (code) {
            case 1:
                plan = "This treatment was prescribed by the surgeon.";
                patient.setTreatmentPlan(plan);
                break;
            case 2:
                plan = "This treatment was prescribed by the dentist.";
                patient.setTreatmentPlan(plan);
                break;
            default:
                plan = "This treatment was prescribed by the therapist.";
                patient.setTreatmentPlan(plan);
                break;
        }

        patient.setDoctor(therapist.getDoctor(patient.getTreatmentPlan()));

        patient.doctor.showInfo();
        System.out.println("План лечения врача - " + patient.getTreatmentPlan());

    }
}
