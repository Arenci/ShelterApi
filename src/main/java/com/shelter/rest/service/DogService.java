package com.shelter.rest.service;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.shelter.rest.bean.DogBean;
import com.shelter.rest.entity.Dog;

@Path("Dog")
public class DogService {

	@EJB
	DogBean dogBean;
	
	@GET
	@Path("getDogById")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDogByIdJSON(
            @QueryParam("id") String id
    ) {
        Dog dog = dogBean.getDogById(id);
        return Response.status(200).entity(dog).build();
    }
}
