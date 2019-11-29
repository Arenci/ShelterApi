package com.shelter.rest.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.shelter.rest.bean.EmployeeBean;
import com.shelter.rest.entity.Employee;


@Path("Employee")
public class EmployeeService {

	
	@EJB
	EmployeeBean employeeBean;
	
	private final String status = "{\"status\":\"ok\"}";
	
	@GET
    @Path("getEmployeesByShelter")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployeesByShelter( @QueryParam("id") String id) {
        List<Employee> results = employeeBean.getEmployeesByShelterId(id);
        return results;
    }
	
	
	@DELETE
    @Path("deleteEmployeeById")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteEmployee(
            @QueryParam("id")String emp_id
    ){
        employeeBean.deleteShelterById(emp_id);
        return Response.status(200).entity(status).build();
    }
}
