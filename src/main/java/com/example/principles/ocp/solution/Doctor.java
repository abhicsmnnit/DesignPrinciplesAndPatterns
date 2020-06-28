package com.example.principles.ocp.solution;

public class Doctor extends Employee {
    public Doctor(int id, String name, boolean isOnDuty) {
        super(id, name, isOnDuty);
    }

    @Override
    public void performDuties() {
        diagnose();
        prescribeMedicines();
    }

    private void diagnose() {
        System.out.println("Diagnosing...");
    }

    private void prescribeMedicines() {
        System.out.println("Prescribing...");
    }
}
