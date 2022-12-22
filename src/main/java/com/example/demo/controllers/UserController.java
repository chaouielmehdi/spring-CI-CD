package com.example.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
	@GetMapping("/users")
	String getUsers() {
		return "Users list is empty";
	}
}
