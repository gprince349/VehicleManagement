package multithreading.sync;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(false);

        //producer
        Thread producer = new Thread(()-> {
            sharedResource.produce();
        });
        //consumer
        Thread consumer = new Thread(()-> {
            sharedResource.consume();
        });

        consumer.start();
        producer.start();
    }
}
