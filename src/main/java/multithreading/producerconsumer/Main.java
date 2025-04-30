package multithreading.producerconsumer;

public class Main {

    public static void main(String[] args) {

        SharedQueue sharedQueue = new SharedQueue(1);
        //producers
        Thread producer = new Thread(()-> {
            for(int i=0; i<20; i++){
                sharedQueue.produce(i);
            }
        });

        //consumers
        Thread consumer = new Thread(()-> {
            while(true){
                sharedQueue.consume();
            }
        });

        producer.start();
        consumer.start();

    }
}
