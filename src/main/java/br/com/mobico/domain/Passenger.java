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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the passenger database table.
 * 
 */
@Entity
@Table(name="passenger")
@NamedQuery(name="Passenger.findAll", query="SELECT p FROM Passenger p")
@Getter
@Setter
public class Passenger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PASSENGER_ID_GENERATOR", sequenceName="PASSENGER_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PASSENGER_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer id;

	//bi-directional many-to-one association to Profile
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile;

	//bi-directional many-to-one association to Ride
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ride_id")
	private Ride ride;
}