package com.prolim.DevOpProject;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@Slf4j
public class MainController{
	Logger logger= LoggerFactory.getLogger(MainController.class);
	@GetMapping("/")
	public String homePage() {
		LocalDateTime localDateTime= LocalDateTime.now();
		logger.info("accessed homepage At "+ localDateTime);
		return "Welcome to HomePage, Check Kibana";
	}
	@GetMapping("/logs")
	public String logsPage() {
		LocalDateTime localDateTime= LocalDateTime.now();
		logger.info("accessed logs page At "+ localDateTime);
		return "Welcome to Log page , Check Kibana";
	}
	@GetMapping("/err")
	public String ErrPage() {
		LocalDateTime localDateTime= LocalDateTime.now();
		logger.error("accessed err page At "+ localDateTime);
		return "Welcome to Error page , Check Kibana";
	}
	@GetMapping("/warn")
	public String WarnPage() {
		LocalDateTime localDateTime= LocalDateTime.now();
		logger.warn("accessed warning page At "+ localDateTime);
		return "Welcome to Warning Page  , Check Kibana";
	}
}

