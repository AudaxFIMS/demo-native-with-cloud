package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private final TestRepository testRepository;
	
	@Autowired
	public TestController(TestRepository testRepository) {
		this.testRepository = testRepository;
	}
	
	@GetMapping("/test")
	public List<Test> getTestEntities() {
		return testRepository.findAll();
	}
}
