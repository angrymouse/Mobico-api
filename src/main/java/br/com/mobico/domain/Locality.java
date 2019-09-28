package br.com.mobico.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the passenger database table.
 * 
 */
@Entity
@Table(name="locality")
@Getter
@Setter
public class Locality implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 5807065283242648841L;

	@Id
	@SequenceGenerator(name="LOCALITY_ID_GENERATOR", sequenceName="LOCALITY_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOCALITY_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer id;

	@Column(nullable=false, length=2147483647)
	private String name;
	
	@Column(nullable=false, length=2147483647)
	private String address;

	private Boolean active;

	@ManyToOne
	@JoinColumn(name="locality_type")
	private LocalityType type;
}