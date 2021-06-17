package com.kumarg.exammate.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 * 
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */


@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	private Long uderId;
	
	@Column(name = "USER_NAME")
	@NotEmpty(message = "Please enter userName")
	@Size(min = 6, message = "user name should have at least 6 characters")
	private String userName;
	
	@Column(name ="FIRST_NAME")
	@NotEmpty(message = "Please enter firstName")
	@Size(min = 3, message = "first name should have at least 3 characters")
	private String firstName;
	
	@Column(name ="LAST_NAME")
	@NotEmpty(message = "Please enter lastName")
	@Size(min = 3, message = "last name should have at least 3 characters")
	private String lastName;
	
	@Column(name="EMAIL")
	@NotEmpty(message = "Please enter email")
	@Email
	private String email;
	
	@Column(name="PASSWORD")
	@NotEmpty(message = "Please enter password")
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;
	
	@Column(name="PHONE_NUMBER")
	@NotBlank(message = "Phone Number is required")
	@Size(max = 15,min=10, message = "Phone Number length should be less than or equal to 15")
	private String phoneNumber;
	
	//@NotEmpty
	@Column(name="ENABLED")
	private boolean enabled = true;
	
	@NotEmpty(message = "Please enter profile image link")
	@Column(name="PROFILE")
	private String profile;
	
    //mapping 
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="user")
	@JsonIgnore
	private Set<UserRole> userRoles = new HashSet<UserRole>();
	
}
