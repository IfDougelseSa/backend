package com.bbproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bbproject.dto.ControlDTO;
import com.bbproject.entities.Control;
import com.bbproject.entities.User;
import com.bbproject.repositories.ControlRepository;

@Service
public class ControlService{
	
	@Autowired
	private ControlRepository repository;
	
	@Autowired
	private AuthService authService;
	
	
	@Transactional(readOnly = true)
	public Page<ControlDTO> controlForCurrentUser(Pageable pageable) {
		User user = authService.authenticated();
		Page<Control> page = repository.findByUser(user, pageable);
		return page.map(x -> new ControlDTO(x));
	}

	@Transactional
	public ControlDTO insert(ControlDTO obj) {
		
		Control control = new Control();
		
		//control.setDate(obj.getDate());
		
		User user = authService.authenticated();
		user.setId(obj.getUserId());
		
		control.setUser(user);
		
		control = repository.save(control);
		
		return new ControlDTO(control);
	}


	
	
}
