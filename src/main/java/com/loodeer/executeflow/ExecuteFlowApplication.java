package com.loodeer.executeflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:application.xml")
public class ExecuteFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExecuteFlowApplication.class, args);
    }

}
