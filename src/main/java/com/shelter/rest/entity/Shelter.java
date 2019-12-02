package com.shelter.rest.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the shelter database table.
 * 
 */
@Entity
@NamedQueries({@NamedQuery(name="Shelter.findAll", query="SELECT s FROM Shelter s")
,			   @NamedQuery(name="Shelter.findShelterById", query="SELECT d FROM Shelter d where d.id = :shltr_id")
,			   @NamedQuery(name="Shelter.deleteShelterById", query ="DELETE FROM Shelter d WHERE d.id = :shltr_id")



})


public class Shelter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	private String name;
	
	private String img;

	//bi-directional many-to-one association to Employee
	@OneToMany(fetch= FetchType.EAGER, mappedBy="shelter")
	private List<Employee> employees;
	
	public Shelter() {
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getImg() {
		return this.img;
	}
	
	public void setImgPath(String img) {
		this.img = img;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setShelter(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setShelter(null);

		return employee;
	}

}