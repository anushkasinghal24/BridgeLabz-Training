package org.example.fundoo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationConsumer {

    @RabbitListener(queues = "user.registered.queue")
    public void consumeMessage(String message) {

        System.out.println("Message received: " + message);
    }
}