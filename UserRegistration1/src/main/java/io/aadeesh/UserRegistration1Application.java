package io.aadeesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import io.aadeesh.controller.UserController;

@SpringBootApplication
public class UserRegistration1Application 
{
	
	@Autowired
	private UserController controller;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(UserRegistration1Application.class, args);
	}
	
	@Component
	public class CommandLineRunnerImpl implements CommandLineRunner {

	    @Override
	    public void run(String... args) throws Exception {
	        System.out.println("In CommandLineRunnerImpl ");

	        for (String arg : args) {
	            System.out.println(arg);
	        }
	    }
	    
	    UserController con=new UserController();
	  //  con.home();
	  //  controller.home();
	}
	
}
