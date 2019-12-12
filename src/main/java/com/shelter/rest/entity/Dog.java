package com.shelter.rest.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the dog database table.
 * 
 */
@Entity
@NamedQueries({@NamedQuery(name="Dog.findAll", query="SELECT d FROM Dog d")
, 			   @NamedQuery(name="Dog.findByEmployee", query="SELECT d FROM Dog d ")
, 			   @NamedQuery(name="Dog.findById", query="SELECT d FROM Dog d where d.id = :dog_id")
,			   @NamedQuery(name="Dog.deleteDogById", query="DELETE FROM Dog d WHERE d.id = :dog_id")



})

public class Dog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;
	
	private String breed;
	
	private int age;

	private String code;
	
	private String img;
	
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	//bi-directional many-to-one association to Appoint
	@OneToMany(fetch= FetchType.EAGER, mappedBy="dog")
	private List<Appoint> appoints;

	//bi-directional many-to-many association to Employee
	@JsonIgnore
	@ManyToMany(mappedBy="dogs")
	private List<Employee> employees;

	public Dog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Appoint> getAppoints() {
		return this.appoints;
	}

	public void setAppoints(List<Appoint> appoints) {
		this.appoints = appoints;
	}

	public Appoint addAppoint(Appoint appoint) {
		getAppoints().add(appoint);
		appoint.setDog(this);

		return appoint;
	}

	public Appoint removeAppoint(Appoint appoint) {
		getAppoints().remove(appoint);
		appoint.setDog(null);

		return appoint;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}