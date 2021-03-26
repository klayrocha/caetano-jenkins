package com.klayrocha.caetanojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JenkinsController {

	@GetMapping
	public String getHello() {
		return "Caetano Jenkins Alterado";
	}
}
