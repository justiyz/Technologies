package com.technologies.thread;

class MultiThreadingImpl {

    public static void main(String[] args) {

        //Multi threading class extending Thread class implementation
        for (int i = 1; i < 5; i++) {
            MultiThreadingExtendsThread threading = new MultiThreadingExtendsThread(i);
            threading.start();
        }

        //Multi threading class implementing Runnable interface implementation
        for (int i = 1; i < 5; i++) {
            MultiThreadingImplementsRunnable threading = new MultiThreadingImplementsRunnable(i);
            Thread thread = new Thread(threading);
            thread.start();
        }
    }
}
