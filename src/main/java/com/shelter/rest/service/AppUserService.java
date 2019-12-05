package com.shelter.rest.service;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.shelter.rest.bean.AppUserBean;
import com.shelter.rest.entity.Appuser;

@Path("AppUser")
public class AppUserService {

	
	@EJB
	AppUserBean appUserBean;
	
	@GET
	@Path("getUserById")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserByIdJSON(
            @QueryParam("id") String id
    ) {
        Appuser appUser = appUserBean.getUserById(id);
        return Response.status(200).entity(appUser).build();
    }
}
