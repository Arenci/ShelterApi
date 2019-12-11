package com.shelter.rest.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import com.shelter.rest.entity.Employee;



@Stateless
public class EmployeeBean {

	@PersistenceContext(unitName="ShelterApi")
    EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeesByShelterId(String shltr_id){
        Query q = em.createNamedQuery("Employee.findEmployeeByShelter");
        q.setParameter("shltr_id", 	Integer.parseInt(shltr_id));
        List<Employee> d = q.getResultList();
        return d;
    }
	
	public void deleteEmployeeById(String emp_id){
        Query q = em.createNamedQuery("Employee.deleteEmployee");
        q.setParameter("emp_id", Integer.parseInt(emp_id));
        q.executeUpdate();     
   }
	
	
	public Employee getEmployeeById(String emp_id) {
		Query q = em.createNamedQuery("Employee.findEmployeeById");
        q.setParameter("emp_id", Integer.parseInt(emp_id));
        Employee d = (Employee)q.getSingleResult();
        return d;
	}
	
	public boolean createEmployee(Employee employee){		
        em.persist(employee);        
        return true;
    }
	
	public void updateEmployee(Employee employee){      
		Query q = em.createQuery("UPDATE Employee d SET d.name = :emp_name, d.email = :emp_email,"
				+ "d.lastName1 = :emp_lastName1, d.lastName2 = :emp_lastName2,"
				+ "d.telephone = :emp_telephone, d.dni = :emp_dni WHERE d.id = :emp_id");
		q.setParameter("emp_id", employee.getId());
		q.setParameter("emp_name", employee.getName());
		q.setParameter("emp_lastName1", employee.getLastName1());
		q.setParameter("emp_lastName2", employee.getLastName2());
		q.setParameter("emp_email", employee.getEmail());
		q.setParameter("emp_telephone", employee.getTelephone());
		q.setParameter("emp_dni", employee.getDni());
		q.executeUpdate();		
    }
	
}
