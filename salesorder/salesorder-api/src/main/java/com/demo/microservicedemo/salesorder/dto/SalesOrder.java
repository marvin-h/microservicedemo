package com.demo.microservicedemo.salesorder.dto;

import java.io.Serializable;

public class SalesOrder implements Serializable {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
