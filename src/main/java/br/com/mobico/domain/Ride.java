package br.com.mobico.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the ride database table.
 * 
 */
@Entity
@Table(name="ride")
@NamedQuery(name="Ride.findAll", query="SELECT r FROM Ride r")
public class Ride implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RIDE_ID_GENERATOR", sequenceName="ride_id_seq", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RIDE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	@Getter
	private Integer id;

	@Column(name="departure_time", nullable=false)
	@Getter @Setter
	private Timestamp departureTime;

	@ManyToOne
	@JoinColumn(name="van_id", nullable=false)
	@Getter @Setter
	private Van van;

	@OneToOne
	@JoinColumn(name="origin")
	@JsonProperty(access = Access.READ_ONLY)
	@Getter @Setter
	private Locality origin;
	
	@OneToOne
	@JoinColumn(name="destination")
	@JsonProperty(access = Access.READ_ONLY)
	@Getter @Setter
	private Locality destination;
	
	@Column(nullable=false)
	@Getter @Setter
	private Integer vacancies;

	@OneToMany(mappedBy="ride", cascade = CascadeType.PERSIST)
	private List<Passenger> passengers;
	
	@Getter @Setter
	private Boolean active;
	
	@Column(name="origin_description", nullable=true)
	@Getter @Setter
	private String originDescription = null;

	public List<Passenger> getPassengers() {
		if(passengers == null) {
			passengers = new ArrayList<>();
		}
		return passengers;
	}
}