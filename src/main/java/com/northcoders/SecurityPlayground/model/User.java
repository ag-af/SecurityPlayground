package com.northcoders.SecurityPlayground.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan

public class User {

    @Id
    @GeneratedValue
    long id;


}
