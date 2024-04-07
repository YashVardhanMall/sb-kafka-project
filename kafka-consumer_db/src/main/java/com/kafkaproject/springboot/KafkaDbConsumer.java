package com.kafkaproject.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDbConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDbConsumer.class);
	
	@KafkaListener(topics="wikimedia_recentchanges",groupId="myGroup")
	public void consume(String msg) {
		
		LOGGER.info(String.format("message recieved => %s", msg));
		
	}
}
