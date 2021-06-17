package com.kumarg.exammate;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kumarg.exammate.entity.Role;
import com.kumarg.exammate.entity.User;
import com.kumarg.exammate.entity.UserRole;
import com.kumarg.exammate.service.UserService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ExammateApplication implements CommandLineRunner {
	
	private final UserService userServie;

	public static void main(String[] args) {
		SpringApplication.run(ExammateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setUserName("ganesh123");
		user.setFirstName("Ganesh");
		user.setLastName("Kumar");
		user.setEmail("ganesh@gmail.com");
		user.setPassword("123456789");
		user.setPhoneNumber("7814120512");
		user.setProfile("default.png");
		
		Role role = new Role();
		role.setRoleName("ADMIN");
		
		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		
		User user1  = this.userServie.createUser(user, userRoleSet);
		System.out.println(user1.getFirstName());
	}

}
