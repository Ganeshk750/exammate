/**
 * 
 */
package com.kumarg.exammate.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


import com.kumarg.exammate.entity.UserRole;
import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */

@Data
@NoArgsConstructor
public class RoleDto implements Serializable {

	private static final long serialVersionUID = 374364700442038477L;
	
	private Long roleId;
	
	@NotNull
	private String roleName;
	
	@NotNull
	private Set<UserRole> userRoles = new HashSet<UserRole>();
}
