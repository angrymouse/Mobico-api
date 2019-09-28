package br.com.mobico.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@Table(name="account")
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
@Getter
@Setter
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCOUNT_ID_GENERATOR", sequenceName="ACCOUNT_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCOUNT_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="created_at", nullable=false)
	private Date createdAt;

	@Column(nullable=false, length=1000)
	private String email;

	@Column(nullable=false, length=1000)
	private String password;
	
	//bi-directional one-to-one association to DriverProfile
	@JsonIgnore
	@OneToOne(mappedBy="account", fetch=FetchType.LAZY )
	private DriverProfile driverProfile;
}