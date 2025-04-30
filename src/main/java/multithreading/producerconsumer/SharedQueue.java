package multithreading.producerconsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedQueue {

    Queue<Integer> queue;
    int capacity;

    public SharedQueue(int capacity){
        this.capacity = capacity;
        queue = new ArrayDeque<>();
    }

    public synchronized void produce(int v){
        while(queue.size()>= capacity){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }

        System.out.println("produced: " + v);
        queue.add(v);
        notifyAll();
    }

    public synchronized void consume(){
        while (queue.size() <= 0){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }

        System.out.println("consumed: " + queue.poll());
        notifyAll();
    }
}
