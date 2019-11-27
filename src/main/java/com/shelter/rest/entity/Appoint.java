package com.shelter.rest.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


/**
 * The persistent class for the appoint database table.
 * 
 */
@Entity
@NamedQuery(name="Appoint.findAll", query="SELECT a FROM Appoint a")
public class Appoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AppointPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	//bi-directional many-to-one association to Appuser
	@JsonIgnore()
	@ManyToOne
	@JoinColumn(name="UserID")
	private Appuser appuser;

	//bi-directional many-to-one association to Dog
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="DogID")
	private Dog dog;

	public Appoint() {
	}

	public AppointPK getId() {
		return this.id;
	}

	public void setId(AppointPK id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Dog getDog() {
		return this.dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

}