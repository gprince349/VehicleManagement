package multithreading.basics;

public class PrintThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I'm Thread 2: "+ Thread.currentThread().getName());
    }
}
