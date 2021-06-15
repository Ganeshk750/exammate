/**
 * 
 */
package com.kumarg.exammate.service;

import java.util.Set;

import com.kumarg.exammate.dto.UserDto;
import com.kumarg.exammate.dto.UserRoleDto;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */
public interface UserService {
	
	public UserDto createUser(UserDto user, Set<UserRoleDto> userRoleDto);

}
