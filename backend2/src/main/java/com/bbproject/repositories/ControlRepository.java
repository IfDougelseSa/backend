package com.bbproject.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbproject.entities.Control;
import com.bbproject.entities.User;

@Repository
public interface ControlRepository extends JpaRepository<Control, Long> {
	
	Page<Control> findByUser(User user, Pageable page);
	
}
