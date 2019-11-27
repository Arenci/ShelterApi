package com.shelter.rest.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.shelter.rest.entity.Shelter;

@Stateless
public class ShelterBean {

	
	
	@PersistenceContext(unitName="ShelterApi")
    EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Shelter> getShelters(){
        Query q = em.createNamedQuery("Shelter.findAll");
        List<Shelter> results = q.getResultList();
        return results;
    }
	
	public Shelter getShelterById(String shltr_id){
        Query q = em.createNamedQuery("Shelter.findShelterById");
        q.setParameter("shltr_id", 	Integer.parseInt(shltr_id));
        Shelter d = (Shelter)q.getSingleResult();
        return d;
    }
	
//	public boolean createShelter(Shelter shelter){
//        em.persist(shelter);        
//        return true;
//    }
	
	public void deleteShelterById(String shltr_id){
        Query q = em.createNamedQuery("Shelter.deleteShelterById");
        q.setParameter("shltr_id", Integer.parseInt(shltr_id));
        q.executeUpdate();     
    }
	public void updateShelter(Shelter shelter){      
		em.persist(shelter);      
    }
	
}
