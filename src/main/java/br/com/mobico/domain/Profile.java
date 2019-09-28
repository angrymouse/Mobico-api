package br.com.mobico.domain;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
@Table(name="profile")
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
@Getter
@Setter
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private Integer id;
	
	@Column(length=2147483647)
	private String cnh;

	@Column(name="cnh_valid")
	private Boolean cnhValid;

	@Column(length=2147483647)
	private String cpf;

	@Column(name="\"cpfValid\"")
	private Boolean cpfValid;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth", nullable=false)
	private Date dateOfBirth;

	@Column(name="first_name", nullable=false, length=2147483647)
	private String firstName;

	@Column(name="\"lastName\"", nullable=false, length=2147483647)
	private String lastName;

	@Column(nullable=false, length=2147483647)
	private String phone;

	@Column(length=2147483647)
	private String rg;

	@Column(name="\"rgValid\"")
	private Boolean rgValid;


	@JsonIgnore
	@OneToMany(mappedBy="profile")
	private List<Passenger> passengers;

	@JsonIgnore
	@OneToMany(mappedBy="profile")
	private List<Van> vans;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
	private Account account;

	public Passenger addPassenger(Passenger passenger) {
		getPassengers().add(passenger);
		passenger.setProfile(this);

		return passenger;
	}

	public Passenger removePassenger(Passenger passenger) {
		getPassengers().remove(passenger);
		passenger.setProfile(null);

		return passenger;
	}
}