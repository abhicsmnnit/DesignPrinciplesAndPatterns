package com.example.principles.ocp;

public class Nurse extends Employee {
    public Nurse(int id, String name, boolean isOnDuty) {
        super(id, name, isOnDuty);
        System.out.println("Nurse " + name + " is here");
    }
}
