package com.technologies.thread;

public class MultiThreadingImpl {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            MultiThreadingExtendsThread threading = new MultiThreadingExtendsThread(i);
            threading.start();
        }

    }
}
