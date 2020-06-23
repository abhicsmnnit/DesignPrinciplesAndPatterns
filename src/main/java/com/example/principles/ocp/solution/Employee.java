package com.example.principles.ocp.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Employee {
    private int id;
    private String name;
    private boolean isOnDuty;

    public abstract void performDuties();
}
