package com.bootcamp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "yanki")
public class Yanki {
    @EqualsAndHashCode.Include
    @Id
    private String id;
    private String typeDocument;
    private String document;
    private String telephone;
    private String imei;
    private String email;
}
