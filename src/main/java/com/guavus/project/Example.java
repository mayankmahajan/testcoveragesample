package com.guavus.project;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	@RequestMapping("/hi")
	public String hiworld(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hi World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}
