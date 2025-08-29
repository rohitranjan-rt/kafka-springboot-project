package com.kafka.springboot.producer;

import com.kafka.springboot.producer.handler.KafkaHandler;
import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class Producer {

    private KafkaTemplate<String, String> kafkaTemplate;

    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage() throws InterruptedException {
        log.info("Send message....");

        String topic = "kafkaTopic";

        EventHandler eventHandler = new KafkaHandler(topic, kafkaTemplate);
        String url = "https://stream.wikimedia.org/v2/stream/recentchange";
        String uri = "http://localhost:8082/";
        EventSource.Builder builder = new EventSource.Builder(eventHandler, URI.create(uri));
        EventSource eventSource = builder.build();
        eventSource.start();

        TimeUnit.MINUTES.sleep(5);

    }
}
