package com.practice.messaging.standaloneactivemqexample.resource;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerResource {
	
	@JmsListener(destination="standalone.queue")
	public void consume(String message) {
		System.out.println(String.format("Received a message: %s ", message));
	}
}
