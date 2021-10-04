package net.ferdousgoogle.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.ferdousgoogle.springboot.repository.UserRepository;
import net.ferdousgoogle.springboot.model.User;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("users")
	public List <User> getUsers(){
		return this.userRepository.findAll();
	}

}
