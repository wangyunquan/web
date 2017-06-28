package com.buswe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
//		System.out.println(new StandardPasswordEncoder().encode("ding"));
		//insert into `base_userinfo` (`id`, `timestamp`, `accountNonExpired`, `accountNonLocked`, `credentialsNonExpired`, `email`, `enabled`, `online`, `password`, `username`) values('2',NULL,'','','','email','','','b61176d5a6b02c03c317c89c42ad616ea26f7fc4fcf448a78358d3f3430003005838981d5a164d91','w');

	}
	
	@Bean
	CommandLineRunner init() {
		return (args) -> {
            FileSystemUtils.deleteRecursively(new File("upload"));
            Files.createDirectory(Paths.get("upload"));
            Files.createDirectory(Paths.get("upload/file"));
            Files.createDirectory(Paths.get("upload/image"));
            Files.createDirectory(Paths.get("upload/video"));
		};
	}
}
