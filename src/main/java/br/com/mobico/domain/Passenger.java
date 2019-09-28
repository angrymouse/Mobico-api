package br.com.mobico.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


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

	//bi-directional many-to-one association to DriverProfile
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;

	//bi-directional many-to-one association to Ride
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="ride_id")
	private Ride ride;
}