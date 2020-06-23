package com.example.principles.ocp.solution;

public class Nurse extends Employee {
    public Nurse(int id, String name, boolean isOnDuty) {
        super(id, name, isOnDuty);
    }

    void checkVitals() {
        System.out.println("Checking vital...");
    }

    void drawBlood() {
        System.out.println("Checking vital...");
    }

    void clearTheWard() {
        System.out.println("Clearing the patient ward...");
    }

    @Override
    public void performDuties() {
        checkVitals();
        drawBlood();
        clearTheWard();
    }
}
