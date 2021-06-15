package com.kumarg.exammate.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kumarg.exammate.entity.UserRole;

import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * 
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */

@Data
@NoArgsConstructor
public class UserDto implements Serializable{

	private static final long serialVersionUID = -4807007541792905730L;
	
	private Long userId;
	
	@NotEmpty
	@Size(min = 6, message = "user name should have at least 6 characters")
	private String userName;
	
	@NotEmpty
	@Size(min = 3, message = "first name should have at least 3 characters")
	private String firstName;
	
	@NotEmpty
	@Size(min = 3, message = "last name should have at least 3 characters")
	private String lastName;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;
	
	@NotBlank(message = "Phone Number is required")
	@Size(max = 15,min=10, message = "Phone Number length should be less than or equal to 15")
	private String phoneNumber;
	
	@NotEmpty
	private boolean enabled = true;
	
	@NotEmpty
	private String profile;
	
	@JsonIgnore
	private Set<UserRole> userRoles = new HashSet<UserRole>();
}
