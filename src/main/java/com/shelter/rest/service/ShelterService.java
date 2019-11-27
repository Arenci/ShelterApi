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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.shelter.rest.bean.ShelterBean;
import com.shelter.rest.entity.Shelter;





@Path("Shelter")
public class ShelterService {

	
	@EJB
	ShelterBean shelterBean;
	
	private final String status = "{\"status\":\"ok\"}";
	
	@GET
    @Path("getShelters")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Shelter> getShelterJSON() {
        List<Shelter> results = shelterBean.getShelters();
        return results;
    }
	
	@GET
	@Path("getShelterById")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getShelterByIdJSON(
            @QueryParam("id") String id
    ) {
        Shelter shelter = shelterBean.getShelterById(id);
        return Response.status(200).entity(shelter).build();
    }
	
//	@POST
//	@Path("createShelter")
//	public void createShelter(Shelter shelter) {
//		shelterBean.createShelter(shelter);
//	}
	
	
	@DELETE
	@Path("deleteShelterById")
    @Produces(MediaType.APPLICATION_JSON)
	public Response deleteShelter(
	            @QueryParam("id")String id	            
	){
		shelterBean.deleteShelterById(id);
	        return Response.status(200).entity(status).build();
    }
	
//	@PUT
//	@Path("updateShelter")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response updateShelter(Shelter shelter) {
//		shelterBean.updateShelter(shelter);
//		return Response.status(200).entity(status).build();
//	}
}
