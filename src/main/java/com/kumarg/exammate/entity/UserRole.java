/**
 * 
 */
package com.kumarg.exammate.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */

@Entity
@Table(name="user_roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	
	@NotEmpty
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	@NotEmpty
	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;
}
