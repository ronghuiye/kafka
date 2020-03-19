package com.example.kafka.consumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics = "users")
	public void consume(String message) throws IOException{
		System.out.println(message);
		logger.info(String.format("#### -> Consumed message -> %s", message));
	}
}
