package multithreading.basics;

public class PrintThread1 implements Runnable{
    @Override
    public void run(){
        System.out.println("I'm Thread 1: " + Thread.currentThread().getName());
    }
}
