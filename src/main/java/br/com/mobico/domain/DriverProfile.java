package br.com.mobico.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the driverProfile database table.
 * 
 */
@Entity
@Table(name="driverProfile")
@NamedQuery(name="DriverProfile.findAll", query="SELECT p FROM DriverProfile p")
@Getter
@Setter
public class DriverProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private Integer id;

	@Column(name="name", nullable=false, length=1000)
	private String name;

	@Column(nullable=false, length=1000)
	private String phone;

	@JsonIgnore
	@OneToMany(mappedBy="driverProfile")
	private List<Van> vans;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
	private Account account;
}