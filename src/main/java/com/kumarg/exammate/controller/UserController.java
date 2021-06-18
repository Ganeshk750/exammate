/**
 * 
 */
package com.kumarg.exammate.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumarg.exammate.entity.Role;
import com.kumarg.exammate.entity.User;
import com.kumarg.exammate.entity.UserRole;
import com.kumarg.exammate.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:Jun 15, 2021
 *
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class UserController {

	private final UserService userService;
    
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception {
        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleName("USER");
        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        User savedUser = this.userService.createUser(user, roles);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers() {
        List<User> GetAllUser = this.userService.getAllUsers();
		return new ResponseEntity<List<User>>(GetAllUser, HttpStatus.OK);
	}
	


}
