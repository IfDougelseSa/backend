package com.bbproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbproject.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
