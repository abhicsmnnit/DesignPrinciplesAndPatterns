package com.example.principles.ocp.solution;

public class Nurse extends Employee {
    public Nurse(int id, String name, boolean isOnDuty) {
        super(id, name, isOnDuty);
    }

    @Override
    public void performDuties() {
        checkVitals();
        drawBlood();
        clearTheWard();
    }

    private void checkVitals() {
        System.out.println("Checking vitals...");
    }

    private void drawBlood() {
        System.out.println("Drawing blood...");
    }

    private void clearTheWard() {
        System.out.println("Clearing the patient ward...");
    }
}
