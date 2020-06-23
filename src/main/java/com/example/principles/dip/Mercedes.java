package com.example.principles.dip;

public class Mercedes implements Car {
    private final MercedesEngine engine;

    public Mercedes() {
        this.engine = new MercedesEngine();
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
