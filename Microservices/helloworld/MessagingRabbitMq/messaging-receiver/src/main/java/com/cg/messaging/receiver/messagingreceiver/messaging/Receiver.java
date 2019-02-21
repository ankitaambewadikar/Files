package com.cg.messaging.receiver.messagingreceiver.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@Bean
	public Queue queue() {
		return new Queue("HelloWorldQ", false);

	}

	@RabbitListener(queues = "HelloWorldQ")
	public void messageReceive(String message) {
		System.out.println("InReceiver" + message);

	}
}
