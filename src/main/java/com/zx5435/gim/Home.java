package com.zx5435.gim;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Home {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Home.class)
                .run(args);
    }

}
