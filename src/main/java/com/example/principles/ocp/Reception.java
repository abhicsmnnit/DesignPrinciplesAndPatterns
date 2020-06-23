package com.example.principles.ocp;

public class Reception {
    void callUpon(Employee e) {
        if (e instanceof Nurse) {
            checkVitals();
            drawBlood();
            clearTheWard();
        } else if (e instanceof Doctor) {
            diagnose();
            prescribeMedicines();
        }
    }

    // Nurse Functions
    void checkVitals() {
        System.out.println("Checking vitals...");
    }

    void drawBlood() {
        System.out.println("Drawing blood...");
    }

    void clearTheWard() {
        System.out.println("Clearing the patient ward...");
    }

    // Doctor's Functions
    void diagnose() {
        System.out.println("Diagnosing...");
    }

    void prescribeMedicines() {
        System.out.println("Prescribing...");
    }
}
