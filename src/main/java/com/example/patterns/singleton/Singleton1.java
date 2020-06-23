package com.example.patterns.singleton;

public class Singleton1 {
    private static Singleton1 uniqueInstance;

    private Singleton1() {
    }

    public static Singleton1 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Singleton1.getUniqueInstance());

        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
