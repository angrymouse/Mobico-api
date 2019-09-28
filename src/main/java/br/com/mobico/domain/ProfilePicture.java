package br.com.mobico.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="profile_picture")
@Getter
@Setter
public class ProfilePicture {
	@Id
	@SequenceGenerator(name="PROFILE_PICTURE_ID_GENERATOR", sequenceName="PROFILE_PICTURE_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROFILE_PICTURE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private Integer id;

	@Type(type = "org.hibernate.type.BinaryType")
    private byte[] picture;
	
	@Column
	private String fileType;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="account_id", nullable=false, insertable=true, updatable=true)
	private Account account;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="account_id", nullable=false, insertable=false, updatable=false)
	private Account profile;
}
