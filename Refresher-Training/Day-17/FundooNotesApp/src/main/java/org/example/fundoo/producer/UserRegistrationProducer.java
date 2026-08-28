package org.example.fundoo.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRegistrationProducer {

    private final RabbitTemplate rabbitTemplate;

    private static final String EXCHANGE = "user.exchange";
    private static final String ROUTING_KEY = "user.registered";

    public void sendRegistrationMessage(String message) {

        rabbitTemplate.convertAndSend(
                EXCHANGE,
                ROUTING_KEY,
                message
        );

        System.out.println("Message sent: " + message);
    }
}