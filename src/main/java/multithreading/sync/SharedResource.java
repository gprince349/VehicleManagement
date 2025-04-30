package multithreading.sync;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SharedResource {

    private boolean itemAvailable;

    public synchronized void produce(){
        System.out.println("into produce now");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        itemAvailable = true;
        System.out.println("produced successfully");
        notifyAll();
    }

    public synchronized void consume(){
        while (!itemAvailable){
            try {
                wait();
            }catch (Exception ex){
                //handle proper exception
            }
        }
        System.out.println("Value is consumed");
        itemAvailable = false;
    }
}
