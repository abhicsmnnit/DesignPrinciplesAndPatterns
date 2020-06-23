package com.example.patterns.singleton;

public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Singleton2.getUniqueInstance());

        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
