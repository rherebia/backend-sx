package br.com.acme.api.entities;

import java.io.Serializable;

public interface BaseEntity extends Serializable {

	Long getId();

	void setId(Long id);
}
