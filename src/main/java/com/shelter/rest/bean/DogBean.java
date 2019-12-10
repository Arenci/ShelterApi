package com.shelter.rest.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.shelter.rest.entity.Dog;



@Stateless
public class DogBean {


	@PersistenceContext(unitName="ShelterApi")
    EntityManager em;
	
	public Dog getDogById(String dog_id) {
		Query q = em.createNamedQuery("Dog.findById");
        q.setParameter("dog_id", Integer.parseInt(dog_id));
        Dog d = (Dog)q.getSingleResult();
        return d;		
	}
	
	public void deleteDog(String dog_id) {
		Query q = em.createNamedQuery("Dog.deleteDogById");
        q.setParameter("dog_id", Integer.parseInt(dog_id));
        q.executeUpdate();    
	}
	
	public boolean createDog(Dog dog){		
        em.persist(dog);        
        return true;
    }
}
