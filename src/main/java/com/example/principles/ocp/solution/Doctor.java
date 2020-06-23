package com.example.principles.ocp.solution;

public class Doctor extends Employee {
    public Doctor(int id, String name, boolean isOnDuty) {
        super(id, name, isOnDuty);
    }

    void diagnose() {
        System.out.println("Diagnosing...");
    }

    void prescribeMedicines() {
        System.out.println("Prescribing...");
    }

    @Override
    public void performDuties() {
        diagnose();
        prescribeMedicines();
    }
}
