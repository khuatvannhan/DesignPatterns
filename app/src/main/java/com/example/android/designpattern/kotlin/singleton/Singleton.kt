package com.example.android.designpattern.kotlin.singleton

class Singleton {
    // Eager initialization
//    companion object {
//        private lateinit var instance: Singleton
//
//        fun getInstance(): Singleton {
//            return instance
//        }
//    }
    // Lazy initialization
    companion object {
        private lateinit var instance: Singleton

        fun getInstance(): Singleton {
            if(instance == null) {
                synchronized(Singleton::class.java) {
                    if (instance == null) {
                        instance = Singleton()
                    }
                }
            }
            return instance
        }
    }
}
