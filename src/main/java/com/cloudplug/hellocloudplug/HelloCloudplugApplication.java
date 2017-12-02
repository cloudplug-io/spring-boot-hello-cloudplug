package com.cloudplug.hellocloudplug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloCloudplugApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloCloudplugApplication.class, args);
	}

	@RestController
    public class CloudPlugController {

	    @GetMapping
        public ResponseEntity<String> helloCloudPlug() {
	        return new ResponseEntity<>("Hello CloudPlug", HttpStatus.OK);
        }
    }
}