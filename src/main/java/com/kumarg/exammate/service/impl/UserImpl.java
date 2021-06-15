/**
 * 
 */
package com.kumarg.exammate.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.kumarg.exammate.dto.UserDto;
import com.kumarg.exammate.dto.UserRoleDto;
import com.kumarg.exammate.entity.User;
import com.kumarg.exammate.entity.UserRole;
import com.kumarg.exammate.repository.RoleRepository;
import com.kumarg.exammate.repository.UserRepository;
import com.kumarg.exammate.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {
	
	private static UserRepository userRepository;
	private static RoleRepository roleRepository;
	
	@Override
	public UserDto createUser(UserDto userDto, Set<UserRoleDto> userRoleDto) {
		UserDto existUser = this.userRepository.findByuserName(userDto.getUserName());
		return null;
	}

	

}
