package com.technologies.thread;

//There are two ways to achieve multi-threading
//The first way is to extend the Thread class and override the run method which is done below
class MultiThreadingExtendsThread extends Thread{

    private final int threadNumber;

    public MultiThreadingExtendsThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        //write whatever method or code that you want to run in multiple threads inside this overridden run method
        for (int i = 1; i <= 3; i++){
            System.out.println(i + " from thread extending Thread" + threadNumber);

            //sleep for one second(1000 milliseconds) between each iteration
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
