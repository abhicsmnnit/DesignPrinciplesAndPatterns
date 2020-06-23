package com.example.patterns.singleton;

public class Singleton3 {
    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getUniqueInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Singleton2.getUniqueInstance());

        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
