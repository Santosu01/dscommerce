package com.devsuperior.dscommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DscommerceApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//		System.out.println("ENCODE = " + passwordEncoder.encode(("123456")));
	//
	//		boolean isSame = passwordEncoder.matches("123456", "$2a$10$h33BJ/4cLsu8V.GZ.uQVju2x2Pz4Fn7QAdvZbginQGMop2gi8iXFG");
	//
	//		System.out.println("is the same " + isSame);
		System.out.println("Aplicação iniciada.....");
	}
}
