package kafka;


//design message broker like kafka

/*
requirements-
    Producer
    Consumer
    Topic
     - 1 partition
    Message

    Kafka

    producer -> push queue(topic) -> consumer

    Topic- (push based)
     Queue<Message> messages, List<Consumer> consumer,
      name,
      subcribe(),
      publish(),

    Consumer:
      name/id,
      process(Message message)

    Producer:
      name/id,
      push(Message message, Topic topic)

    Message:
      id,
      content

    * exclusive access
*/

public class Main {
}
