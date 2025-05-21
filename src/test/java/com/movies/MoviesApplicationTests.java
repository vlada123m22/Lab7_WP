package com.movies;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.logging.Logger;

@SpringBootTest
class MoviesApplicationTests {

	Logger logger = Logger.getLogger(MoviesApplicationTests.class.getName());
	@Autowired
	PasswordEncoder passwordEncoder;
	@Test
	void contextLoads() {
		logger.info(passwordEncoder.encode("password"));
	}

}
