package kafka;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
public class Message {

    private String id;
    private String content;

    public Message(String content) {
        this.id = UUID.randomUUID().toString();
        this.content = content;
    }

}
