package com.robsonalbertassi.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.robsonalbertassi.workshopmongo.domain.User;
import com.robsonalbertassi.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User bruce = new User(null, "Bruce Wayne", "brucewayne@gmail.com", 50);
		User jackie = new User(null, "Jackie Chan", "jackiechan@gmail.com", 67);
		User bob = new User(null, "Bob Marley", "bobmarley@gmail.com", 76);
		
		userRepository.saveAll(Arrays.asList(bruce, jackie, bob));	
	}

}
