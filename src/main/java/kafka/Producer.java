package kafka;

import lombok.Data;

@Data
public class Producer {
    String name;

    public void push(Message message, Topic topic){
         topic.publish(message);
    }

}
