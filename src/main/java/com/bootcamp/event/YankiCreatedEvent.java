package com.bootcamp.event;

import com.bootcamp.model.Yanki;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class YankiCreatedEvent extends Event<Yanki>{
}
