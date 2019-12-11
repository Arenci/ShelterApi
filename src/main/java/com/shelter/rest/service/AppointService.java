package com.shelter.rest.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.shelter.rest.bean.AppointBean;

import com.shelter.rest.entity.Appoint;
import com.shelter.rest.entity.Employee;


@Path("Appoint")
public class AppointService {
	@EJB
	AppointBean appointBean;
	private final String status = "{\"status\":\"ok\"}";
	
	
	
	@GET
    @Path("getAppoints")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appoint> getShelterJSON() {				
        List<Appoint> results = appointBean.getAppoints();
        return results;
    }

	
	
	@POST
	@Path("createAppoint")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAppoint(Appoint appoint) {
		appointBean.createAppoint(appoint);
		return Response.status(200).entity(appoint).build();
	}
	
	
	

	@PUT
	@Path("updateAppoint")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateEmployee(Appoint appoint) {
		appointBean.updateAppoint(appoint);
		return Response.status(200).entity(appoint).build();
	}
}
