package com.teachmeskills.lesson8.task1.run;

import com.teachmeskills.lesson8.task1.entity.IDoctor;
import com.teachmeskills.lesson8.task1.entity.impl.Therapist;
import com.teachmeskills.lesson8.task1.patient.Patient;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Patient patient = new Patient("Tema", 23);
        Therapist therapist = new Therapist();

        System.out.println("Выберте план лечения 1 или 2 : ");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();

        IDoctor doctor = therapist.assignDoctor(code);
        patient.setDoctor(doctor);

        System.out.println("Врач -----------------------\n");
        patient.showInfoDoctor();

        System.out.println("\nПациент -----------------------\n");
        patient.showInfoPatient();

    }
}
