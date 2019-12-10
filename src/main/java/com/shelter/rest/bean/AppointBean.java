package com.shelter.rest.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.shelter.rest.entity.Appoint;
import com.shelter.rest.entity.Shelter;

@Stateless
public class AppointBean {
	
	@PersistenceContext(unitName="ShelterApi")
    EntityManager em;
	
	public void deleteAppoint(String dog_name) {
		Query q = em.createNamedQuery("Appoint.deleteById");
        q.executeUpdate();    
	}
	
	public List<Appoint> getAppoints(){
		Query q = em.createNamedQuery("Appoint.findAll");
        List<Appoint> results = q.getResultList();
        return results;
	}
	
}
