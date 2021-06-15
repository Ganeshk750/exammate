/**
 * 
 */
package com.kumarg.exammate.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */

@Entity
@Table(name="user_roles")
public class UserRole {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;
}
