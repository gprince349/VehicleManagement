package multithreading.basics;

public class ExtendThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("I'm a "+ Thread.currentThread().getName());
    }
}
