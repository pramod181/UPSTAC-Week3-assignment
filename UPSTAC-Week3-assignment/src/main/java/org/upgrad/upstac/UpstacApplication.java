package org.upgrad.upstac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.upgrad.upstac.users.User;
import org.upgrad.upstac.users.UserRepository;
import org.upgrad.upstac.users.UserService;

@SpringBootApplication
public class UpstacApplication {

	public static void main(String[] args) {

		SpringApplication.run(UpstacApplication.class, args);

	}


}
