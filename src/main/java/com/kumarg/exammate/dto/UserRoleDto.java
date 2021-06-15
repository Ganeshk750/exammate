/**
 * 
 */
package com.kumarg.exammate.dto;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.kumarg.exammate.entity.Role;
import com.kumarg.exammate.entity.User;
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
public class UserRoleDto implements Serializable {

	private static final long serialVersionUID = -4437655709884811914L;
	
	private Long userRoleId;
	
	@NotNull
	private User user;
	
	@NotNull
	private Role role;

}
