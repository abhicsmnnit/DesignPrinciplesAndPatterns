package com.example.principles.dip;

public class Ferrari implements Car {
    private final FerrariEngine engine;

    public Ferrari() {
        this.engine = new FerrariEngine();
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
