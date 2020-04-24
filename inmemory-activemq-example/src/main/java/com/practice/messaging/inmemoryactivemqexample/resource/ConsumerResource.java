package com.practice.messaging.inmemoryactivemqexample.resource;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerResource {
	
	@JmsListener(destination="inmemory.queue")
	public void listener(String message) {
		System.out.println(String.format("Received a message: %s ", message));
	}
}
