package com.example.principles.dip.solution;

public class TestDrive {
    public static void main(String[] args) {
        Car mercedes = new Mercedes(new MercedesEngine());
        Car ferrari = new Ferrari(new FerrariEngine());

        testDrive(mercedes);
        testDrive(ferrari);
    }

    private static void testDrive(Car car) {
        car.startEngine();
        car.accelerate();
    }
}
