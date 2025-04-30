package multithreading.basics;

public class Main {
    public static void main(String[] args) {

        //Method 1 using Runnable interface
        PrintThread1 printThread1 = new PrintThread1();
        PrintThread2 printThread2 = new PrintThread2();
        Thread thread1 = new Thread(printThread1);
        Thread thread2 = new Thread(printThread2);

        thread1.start();
        thread2.start();

        //Method2: using extending the Thread class
        ExtendThread1 extendThread1 = new ExtendThread1();
        ExtendThread2 extendThread2 = new ExtendThread2();

        extendThread1.start();
        extendThread2.start();

        //Method 3: using runnable object only but as a lamda function (becoz Runnable is FI (only one public method))
        Thread thread3 = new Thread(()-> {
            System.out.println("I'm a"+Thread.currentThread().getName());
        });

        thread3.start();
    }
}
