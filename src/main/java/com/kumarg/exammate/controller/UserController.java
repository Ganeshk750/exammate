/**
 * 
 */
package com.kumarg.exammate.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kumarg.exammate.dto.UserDto;
import com.kumarg.exammate.entity.User;
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
public class UserController {
	
	/*
	 * private final UserService userService;
	 * 
	 * public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto
	 * userDto){
	 * 
	 * // convert UserDto to User entity User user = new User();
	 * user.setUserName(userDto.getUserName());
	 * user.setFirstName(userDto.getFirstName());
	 * user.setLastName(userDto.getLastName()); user.setEmail(user.getEmail());
	 * user.setPassword(userDto.getPassword());
	 * user.setPhoneNumber(userDto.getPhoneNumber());
	 * user.setProfile(userDto.getProfile());
	 * user.setUserRoles(userDto.getUserRoles());
	 * 
	 * //User userSaved = userService.createUser(user, userRoleDto)
	 * 
	 * // convert User entity to UserDto class UserDto userResponse = new UserDto();
	 * 
	 * return new ResponseEntity<UserDto>(userResponse, HttpStatus.CREATED); }
	 */
}
