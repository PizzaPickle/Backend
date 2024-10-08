package com.example.pickle_common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = {"com.example.pickle_common", "com.example.real_common"})
public class PickleCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PickleCommonApplication.class, args);
	}

}
