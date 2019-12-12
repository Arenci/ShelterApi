package com.shelter.rest.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.shelter.rest.entity.Appuser;


@Stateless
public class AppUserBean {

	
	@PersistenceContext(unitName="ShelterApi")
    EntityManager em;
	
	
	public Appuser getUserById(String shltr_id){
        Query q = em.createNamedQuery("Appuser.findUserById");
        q.setParameter("user_id", 	Integer.parseInt(shltr_id));
        Appuser d = (Appuser)q.getSingleResult();
        return d;
    }
	
	public void createUser(Appuser appuser) {
		em.persist(appuser);
	}
}
