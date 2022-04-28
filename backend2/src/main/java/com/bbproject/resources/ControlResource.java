package com.bbproject.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bbproject.dto.ControlDTO;
import com.bbproject.services.ControlService;

@RestController
@RequestMapping("/control")
public class ControlResource {
	
	@Autowired
	private ControlService service;
	
	@GetMapping
	public ResponseEntity<Page<ControlDTO>> controlForCurrentUser(Pageable pageable) {
		Page<ControlDTO> page = service.controlForCurrentUser(pageable);	
		return ResponseEntity.ok().body(page);
	}

	
	@PostMapping
	public ResponseEntity<ControlDTO> insert(@Valid @RequestBody ControlDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	

}
