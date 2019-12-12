package com.shelter.rest.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.shelter.rest.entity.Appoint;


@Stateless
public class AppointBean {
	
	@PersistenceContext(unitName="ShelterApi")
    EntityManager em;
	
	public void deleteAppoint(String dog_name) {
		Query q = em.createNamedQuery("Appoint.deleteById");
        q.executeUpdate();    
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Appoint> getAppoints(){
		Query q = em.createNamedQuery("Appoint.findAll");
        List<Appoint> results = q.getResultList();
        return results;
	}
	
	
	public void createAppoint(Appoint appoint) {
		em.persist(appoint);
	}
	
	public void updateAppoint(Appoint appoint) {
		Query q = em.createQuery("UPDATE Appoint a SET a.date= :appoint_date where a.id = :appoint_id");
		q.setParameter("appoint_date", appoint.getDate());
		q.setParameter("appoint_id", appoint.getId());
		q.executeUpdate();
	}
	
}
