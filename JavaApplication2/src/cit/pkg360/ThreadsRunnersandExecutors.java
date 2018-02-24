/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

/**
 *
 * @author mount
 */
public class ThreadsRunnersandExecutors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable task = () -> {
    String threadName = Thread.currentThread().getName();
    System.out.println("Hello " + threadName);
    };

        task.run();

    Thread thread = new Thread(task);
    thread.start();

    System.out.println("Done!");
    sleep();
    }
    


    
    

    private static void sleep() {
        Runnable runnable = () -> {
    try {
        String name = Thread.currentThread().getName();
        System.out.println("Foo " + name);
        Thread.sleep(1000);
        System.out.println("Bar " + name);
    }
    catch (InterruptedException e) {
        e.printStackTrace();
    }
};

Thread thread = new Thread(runnable);
thread.start();
}
}


