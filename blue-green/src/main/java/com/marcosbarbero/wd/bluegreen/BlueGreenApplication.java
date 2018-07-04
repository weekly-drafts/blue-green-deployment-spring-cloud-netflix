package com.marcosbarbero.wd.bluegreen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BlueGreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueGreenApplication.class, args);
	}

	@RestController
	class MetadataController {

		@Value("${eureka.instance.metadata-map.env}")
		private String env;

		@GetMapping("/metadata/env")
		public String env() {
			return env;
		}

	}
}
