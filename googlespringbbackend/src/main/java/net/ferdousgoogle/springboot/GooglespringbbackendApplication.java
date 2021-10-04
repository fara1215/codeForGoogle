package net.ferdousgoogle.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.ferdousgoogle.springboot.model.User;
import net.ferdousgoogle.springboot.repository.UserRepository;

@SpringBootApplication
public class GooglespringbbackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GooglespringbbackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run (String... args) throws Exception {
		this.userRepository.save(new User("ABC", "DEF", "ABC@gmail.com"));
		this.userRepository.save(new User("ABC1", "DEF1", "ABC1@gmail.com"));
		this.userRepository.save(new User("ABC2", "DEF2", "ABC2@gmail.com"));
	}

}
