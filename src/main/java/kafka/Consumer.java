package kafka;

import lombok.Data;

@Data
public class Consumer {
    String name;

    public void process(Message message){
        System.out.println(message.getContent());
    }


}
