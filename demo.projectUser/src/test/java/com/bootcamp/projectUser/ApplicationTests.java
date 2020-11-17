package com.bootcamp.projectUser;

import com.bootcamp.projectUser.entity.User;
import com.bootcamp.projectUser.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTests {


	@Autowired
	private UserService log;
	@Test
	void contextLoads() {
	}

	@Test
	public void registerUser(){
		User user1 = new User("Facundo","Sotelo","Deknasis");
		this.log.save(user1);
		assertNotNull(this.log.getAll());
	}

	@Test()
	public void deleteRegisteredUser(){
		//this.log.deleteById(3);
		assertTrue(this.log.getAll().isEmpty());
	}


}
