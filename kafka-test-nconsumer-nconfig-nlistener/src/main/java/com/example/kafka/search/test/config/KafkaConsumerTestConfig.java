package com.example.kafka.search.test.config;


import com.example.kafka.search.test.listener.KafkaConsumer1Listener;
import com.example.kafka.search.test.listener.KafkaConsumer2Listener;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cool
 * @create 2020-09-16 10:39
 */
@Configuration
@EnableKafka
public class KafkaConsumerTestConfig {
    @Value("${kafka.consumer.server}")
    private String server;
    @Value("${kafka.consumer.group.id}")
    private String groupId;
    @Value("${kafka.consumer.enable.auto.commit}")
    private String commit;
    @Value("${kafka.consumer.session.timeout}")
    private String timeout;
    @Value("${kafka.consumer.auto.commit.interval}")
    private String interval;
    @Value("${kafka.consumer.concurrency}")
    private int concurrency;


    public Map<String, Object> consumerConfigs() {
        Map<String, Object> pros = new HashMap<>();
        pros.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
        pros.put(ConsumerConfig.GROUP_ID_CONFIG, "singleTest1");
        pros.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, commit);
        pros.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, interval);
        pros.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, timeout);
        pros.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        pros.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        return pros;
    }

    public DefaultKafkaConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory1() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setConcurrency(concurrency);
        factory.getContainerProperties().setPollTimeout(1500);
        return factory;
    }



    @Bean
    public KafkaConsumer1Listener listener1() {
        return new KafkaConsumer1Listener();
    }

    @Bean
    public KafkaConsumer2Listener listener2() {
        return new KafkaConsumer2Listener();
    }

}
