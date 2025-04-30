package multithreading.basics;

public class ExtendThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("I'm a "+ Thread.currentThread().getName());
    }
}
