package multithreading.threadpool;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ThreadPoolExecutor executorService = new ThreadPoolExecutor(2,
                4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(4),
                new CustomThreadFactory(), new RejectedTaskHandler());

        System.out.println("start");
        //submit tasks to the pool
        for(int i=0; i<4; i++){
            int var = i;
            executorService.submit(()->{
                System.out.println("executing task "+ var + " by " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();

    }
}

//how to handle the rejected tasks
class RejectedTaskHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Rejected Thread: " + r.toString());
    }
}
