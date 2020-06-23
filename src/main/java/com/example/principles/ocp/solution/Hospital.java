package com.example.principles.ocp.solution;

public class Hospital {
    public static void main(String[] args) {
        Reception reception = new Reception();

        Nurse nisha = new Nurse(1, "Nisha", true);

        Doctor shilpa = new Doctor(2, "Shilpa", true);

        reception.callUpon(nisha);
        reception.callUpon(shilpa);
    }
}
