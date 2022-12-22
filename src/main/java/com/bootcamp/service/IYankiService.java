package com.bootcamp.service;

import com.bootcamp.dto.YankiDto;
import com.bootcamp.model.Yanki;
import reactor.core.publisher.Mono;

public interface IYankiService {

    Mono<Yanki> saveYanki (Yanki yanki);
    Mono<Yanki> yankiTransaction (YankiDto yankiDto);
}
