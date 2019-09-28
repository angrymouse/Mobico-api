package br.com.mobico.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the van database table.
 * 
 */
@Entity
@Table(name="Van")
@NamedQuery(name="Van.findAll", query="SELECT v FROM Van v")
@Getter
@Setter
public class Van implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VAN_ID_GENERATOR", sequenceName="VAN_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VAN_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer id;

	@Column(nullable=false, length=1000)
	private String color;

	@Column(nullable=false, length=1000)
	private String model;

	@Column(nullable=false, length=1000)
	private String plate;
	
	@Column(nullable=false)
	private Boolean active;

	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile;
}