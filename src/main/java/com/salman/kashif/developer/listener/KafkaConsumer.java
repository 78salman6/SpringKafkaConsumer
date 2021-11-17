package com.salman.kashif.developer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.salman.kashif.developer.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "warmup_topic", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message : " + message);
	}
	
	@KafkaListener(topics = "warmup_topic_json", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON message : " + user);
	}
	
}
