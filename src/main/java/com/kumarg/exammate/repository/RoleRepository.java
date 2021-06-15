/**
 * 
 */
package com.kumarg.exammate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kumarg.exammate.entity.Role;

/**
 * @Project:exammate
 * @author:Ganesh
 * @Created:May 23, 2021
 *
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
