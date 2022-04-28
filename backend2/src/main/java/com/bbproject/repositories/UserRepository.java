package com.bbproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbproject.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	User findByEmail(String email);
	
}
