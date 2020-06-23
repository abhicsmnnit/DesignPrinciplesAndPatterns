package com.example.principles.dip;

public class TestDrive {
    public static void main(String[] args) {
        Car mercedes = new Mercedes();
        Car ferrari = new Ferrari();

        testDrive(mercedes);
        testDrive(ferrari);
    }

    private static void testDrive(Car car) {
        car.startEngine();
        car.accelerate();
    }
}
