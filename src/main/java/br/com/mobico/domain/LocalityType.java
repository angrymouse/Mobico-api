package br.com.mobico.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="locality_type")
@Getter
@Setter
public class LocalityType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6144543529802200775L;

	@Id
	@Column(unique=true, nullable=false)
	private Integer id;
	
	@Column(nullable=false, length=1000)
	private String description;
}
