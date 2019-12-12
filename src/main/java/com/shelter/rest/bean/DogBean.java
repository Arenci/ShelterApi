package com.shelter.rest.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Hibernate;

import com.shelter.rest.entity.Dog;
import com.shelter.rest.entity.Employee;

@Stateless
public class DogBean {

	@PersistenceContext(unitName = "ShelterApi")
	EntityManager em;

	public Dog getDogById(String dog_id) {
		Query q = em.createNamedQuery("Dog.findById");
		q.setParameter("dog_id", Integer.parseInt(dog_id));
		Dog d = (Dog) q.getSingleResult();
		return d;
	}

	public void deleteDog(String dog_id) {
		Query q = em.createNamedQuery("Dog.deleteDogById");
		q.setParameter("dog_id", Integer.parseInt(dog_id));
		q.executeUpdate();
	}

	public boolean createDog(Dog dog) {
		em.persist(dog);
		return true;
	}

	

	public void updateDog(Dog dog) {
		Query q = em.createQuery("UPDATE Dog d SET d.name = :dog_name, d.breed = :dog_breed,"
				+ "d.age = :dog_age, d.code = :dog_code," + "d.img = :dog_img WHERE d.id = :dog_id");

		q.setParameter("dog_name", dog.getName());
		q.setParameter("dog_breed", dog.getBreed());
		q.setParameter("dog_age", dog.getAge());
		q.setParameter("dog_code", dog.getCode());
		q.setParameter("dog_img", dog.getImg());
		q.setParameter("dog_id", dog.getId());

		q.executeUpdate();
	}
}
