package org.example.fundoo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue userRegisteredQueue() {
        return new Queue("user.registered.queue");
    }

    @Bean
    public DirectExchange userExchange() {
        return new DirectExchange("user.exchange");
    }

    @Bean
    public Binding userBinding(
            Queue userRegisteredQueue,
            DirectExchange userExchange) {

        return BindingBuilder
                .bind(userRegisteredQueue)
                .to(userExchange)
                .with("user.registered");
    }

}
