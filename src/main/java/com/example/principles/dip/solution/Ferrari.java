package com.example.principles.dip.solution;

public class Ferrari implements Car {
    private final IEngine engine;

    public Ferrari(IEngine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari flies off...");
    }
}
