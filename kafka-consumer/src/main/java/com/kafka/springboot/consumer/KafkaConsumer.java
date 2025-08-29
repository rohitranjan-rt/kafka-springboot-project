package com.kafka.springboot.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KaflaConsumer {

      private EventRepository repo;

    public KaflaConsumer(EventRepository repo) {
        this.repo = repo;
    }

    @KafkaListener(
            topics = "kafkaTopic",
            groupId = "myGroup"
    )
    public void consume(String msg) {

        log.info(String.format("Event message recieved  --> %s", msg));

        Eventdata data = new EventData();
        data.setEvent(data);
        repo.save(data);
    }

}


