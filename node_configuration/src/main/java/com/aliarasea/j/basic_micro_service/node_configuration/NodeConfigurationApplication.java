package com.aliarasea.j.basic_micro_service.node_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NodeConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NodeConfigurationApplication.class, args);
    }

}
