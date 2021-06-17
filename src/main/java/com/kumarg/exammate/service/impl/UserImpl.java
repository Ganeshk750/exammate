/**
 * 
 */
package com.kumarg.exammate.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;


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
	
	
	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User existUser = this.userRepository.findByuserName(user.getUserName());
		if(existUser != null) {
			System.out.println("User is already exist!");
			throw new Exception("User already Present");
		}else {
			for(UserRole role: userRoles) {
				roleRepository.save(role.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			existUser = this.userRepository.save(user);
		}
		return existUser;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	
	
	

	

}
