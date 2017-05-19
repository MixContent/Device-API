package com.device.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;

@SpringBootApplication
@AutoConfigureJson
public class DeviceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceApiApplication.class, args);
	}
}
