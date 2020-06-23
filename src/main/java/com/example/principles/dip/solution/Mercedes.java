package com.example.principles.dip.solution;

public class Mercedes implements Car {
    private final IEngine engine;

    public Mercedes(IEngine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public void accelerate() {
        System.out.println("Merc goes whoooooshh...");
    }
}
