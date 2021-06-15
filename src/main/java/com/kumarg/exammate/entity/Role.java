/**
 * 
 */
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

import com.sun.istack.NotNull;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */

@Entity
@Table(name="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ROLE_ID")
	private Long roleId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	//Mapping
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="role")
	private Set<UserRole> userRoles = new HashSet<UserRole>();

}
