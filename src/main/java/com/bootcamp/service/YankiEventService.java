package com.bootcamp.service;

import com.bootcamp.event.Event;
import com.bootcamp.event.EventType;
import com.bootcamp.event.YankiCreatedEvent;
import com.bootcamp.model.Yanki;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class YankiEventService {
    @Autowired
    private KafkaTemplate<String, Event<?>> producer;

    public void publish(Yanki yanki) {
        YankiCreatedEvent created = new YankiCreatedEvent();
        created.setData(yanki);
        created.setId(UUID.randomUUID().toString());
        created.setType(EventType.CREATED);
        created.setDate(new Date());
        this.producer.send("topic-yanki-3",created);
    }
}
