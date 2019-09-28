package br.com.mobico.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


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

	@Column(nullable=false, length=1000)
	private String name;
	
	@Column(nullable=true, length=1000)
	private String address;

	private Boolean active;

	@ManyToOne
	@JoinColumn(name="locality_type")
	private LocalityType type;
}