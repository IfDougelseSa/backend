package com.bbproject.dto;

import java.time.Instant;

import com.bbproject.entities.Control;

public class ControlDTO {

	private Long id;
	private Instant date;
	private Long userId;

	public ControlDTO() {

	}

	public ControlDTO(Long id, Instant date, Long userId) {

		this.id = id;
		this.date = date;
		this.userId = userId;
	}

	public ControlDTO(Control entity) {

		id = entity.getId();
		date = entity.getDate();
		userId = entity.getUser().getId();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
