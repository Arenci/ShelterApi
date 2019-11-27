package com.shelter.rest.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the appuser database table.
 * 
 */
@Entity
@NamedQuery(name="Appuser.findAll", query="SELECT a FROM Appuser a")
public class Appuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String dni;

	private String email;

	private String lastName1;

	private String lastName2;

	private String name;

	private int telephone;

	//bi-directional many-to-one association to Appoint
	@OneToMany(fetch= FetchType.EAGER, mappedBy="appuser")
	private List<Appoint> appoints;

	public Appuser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName1() {
		return this.lastName1;
	}

	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	public String getLastName2() {
		return this.lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelephone() {
		return this.telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public List<Appoint> getAppoints() {
		return this.appoints;
	}

	public void setAppoints(List<Appoint> appoints) {
		this.appoints = appoints;
	}

	public Appoint addAppoint(Appoint appoint) {
		getAppoints().add(appoint);
		appoint.setAppuser(this);

		return appoint;
	}

	public Appoint removeAppoint(Appoint appoint) {
		getAppoints().remove(appoint);
		appoint.setAppuser(null);

		return appoint;
	}

}