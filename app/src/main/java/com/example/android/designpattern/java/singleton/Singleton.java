package com.example.android.designpattern.java.singleton;

public class Singleton {
    // Eager initialization
//    private static Singleton instance;
//    static {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//    }
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return instance;
//    }
    // Lazy initialization
    private static Singleton instance;

    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
