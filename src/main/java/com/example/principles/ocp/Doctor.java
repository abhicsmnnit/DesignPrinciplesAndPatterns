package com.example.principles.ocp;

public class Doctor extends Employee {
    public Doctor(int id, String name, boolean isOnDuty) {
        super(id, name, isOnDuty);
        System.out.println("Doctor " + name + " is here");
    }
}
