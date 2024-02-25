package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        Appointment appointment = new Appointment();
        Diagnosis diagnosis = new Diagnosis();
        final SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Doctor.class)
                .addAnnotatedClass(Patient.class)
                .addAnnotatedClass(Appointment.class)
                .addAnnotatedClass(Diagnosis.class)
                .buildSessionFactory();
    }
}