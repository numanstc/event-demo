package com.numanstc.emailevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EmailEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailEventApplication.class, args);
	}

}
