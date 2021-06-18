/**
 * 
 */
package com.kumarg.exammate.service;

import java.util.List;
import java.util.Set;

import com.kumarg.exammate.entity.User;
import com.kumarg.exammate.entity.UserRole;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */
public interface UserService {
	
	public User createUser(User user, Set<UserRole> userRole) throws Exception;
	
	public List<User> getAllUsers();
	

}
