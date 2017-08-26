package com.vdzon.configconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigconfigurationserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigconfigurationserverApplication.class, args);
	}
}
