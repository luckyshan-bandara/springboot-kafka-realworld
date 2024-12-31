package com.lucky.springboot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    public static final String TOPIC_NAME = "wikimedia_recentchange";

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(TOPIC_NAME).build();
    }
}
