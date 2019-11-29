package com.shelter.rest.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.shelter.rest.entity.Employee;
import com.shelter.rest.entity.Shelter;

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
	
	public void deleteShelterById(String emp_id){
        Query q = em.createNamedQuery("Employee.deleteEmployeerById");
        q.setParameter("emp_id", Integer.parseInt(emp_id));
        q.executeUpdate();     
   }
	
	
}
