package kafka;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

@Data
@AllArgsConstructor
public class Topic {
    String name;
//    List<Consumer> consumers;
    BlockingQueue<Message> blockingQueue;

    public Topic(String name, int capacity) {
        this.name = name;
        this.blockingQueue = new LinkedBlockingDeque<Message>(capacity);
    }

    public void subscribe(Consumer consumer){

        Thread thread = new Thread(){
            @Override
            public void run(){
                while (true){
                   Message message =  blockingQueue.poll();
                   consumer.process(message);
                }
            }
        };

        thread.start();
    }

    public void publish(Message message){
       blockingQueue.add(message);
    }
}
