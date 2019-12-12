package com.shelter.rest.service;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.shelter.rest.bean.DogBean;
import com.shelter.rest.bean.EmployeeBean;
import com.shelter.rest.entity.Dog;
import com.shelter.rest.entity.Employee;



@Path("Dog")
public class DogService {

	@EJB
	DogBean dogBean;
	
	@EJB
	EmployeeBean employeeBean;
	
	private final String status = "{\"status\":\"ok\"}";
	
	
	
	@GET
	@Path("getDogById")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDogByIdJSON(
            @QueryParam("id") String id
    ) {
        Dog dog = dogBean.getDogById(id);
        return Response.status(200).entity(dog).build();
    }
	
	
	@DELETE
	@Path("deleteDogById")
    @Produces(MediaType.APPLICATION_JSON)
	public Response deleteShelter(
	            @QueryParam("id")String id	            
	){
		dogBean.deleteDog(id);
	        return Response.status(200).entity(status).build();
    }
	
	@POST
	@Path("createDog")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createDog(Dog dog, @QueryParam("id") String id) {				
		
		dogBean.createDog(dog);
		return Response.status(200).entity(dog).build();
	}
	@PUT
	@Path("updateDog")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateShelter(Dog dog) {
		dogBean.updateDog(dog);
		return Response.status(200).entity(dog).build();
	}
}
