package com.shelter.rest.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.shelter.rest.bean.AppointBean;

import com.shelter.rest.entity.Appoint;


@Path("Appoint")
public class AppointService {
	@EJB
	AppointBean appointBean;
	private final String status = "{\"status\":\"ok\"}";
	
//	@DELETE
//	@Path("deleteDogById")
//    @Produces(MediaType.APPLICATION_JSON)
//	public Response deleteAppoint(
//	            @QueryParam("id")String id	            
//	){
//		dogBean.deleteDog(id);
//	        return Response.status(200).entity(status).build();
//    }
	
	@GET
    @Path("getAppoints")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appoint> getShelterJSON() {				
        List<Appoint> results = appointBean.getAppoints();
        return results;
    }

}
