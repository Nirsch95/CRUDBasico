package com.co.sofka.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="users")
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private String city;
}
