package com.shelter.rest.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQueries({@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
, 			   @NamedQuery(name="Employee.findEmployeeByShelter", query ="SELECT e FROM Employee e WHERE e.shelter.id = :shltr_id")
, 			   @NamedQuery(name="Employee.deleteEmployee", query="DELETE FROM Employee e WHERE e.id = :emp_id")
, 			   @NamedQuery(name="Employee.findEmployeeById", query="SELECT e FROM Employee e where e.id = :emp_id")

})

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String dni;

	private String email;

	private String lastName1;

	private String lastName2;

	private String name;

	private int telephone;

	//bi-directional many-to-many association to Dog
	@ManyToMany(fetch= FetchType.EAGER)
	@JoinTable(
		name="takes_care"
		, joinColumns={
			@JoinColumn(name="EmployeeID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="DogID")
			}
		)
	private List<Dog> dogs;

	//bi-directional many-to-one association to Shelter
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ShelterID")
	private Shelter shelter;
	
	public Employee() {
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

	public List<Dog> getDogs() {
		return this.dogs;
	}

	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}

	public Shelter getShelter() {
		return this.shelter;
	}

	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}

}