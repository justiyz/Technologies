package com.technologies.thread;

//The second way is to extend the Implement the Runnable interface and also override the run method which is done below
public class MultiThreadingImplementsRunnable implements Runnable{

    private final int threadNumber;

    public MultiThreadingImplementsRunnable(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        //write whatever method or code that you want to run in multiple threads inside this overridden run method
        for (int i = 1; i <= 3; i++){
            System.out.println(i + " from thread implementing runnable " + threadNumber);

            //sleep for one second(1000 milliseconds) between each iteration
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
