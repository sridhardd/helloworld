/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.helloworld.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author sdhavala
 */
@Path("/HelloWorld")
public class UIService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/test")
    public Response Test() {
        try
        {
            return Response.status(200).entity("My First Hello World. Build Number ##PLACEHOLDER##").build();
        }
        catch (Exception e)
        {
            return Response.status(500).entity("Exception occurred.").build();
        }
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/multiply/{a}/{b}")
    public Response Multiply(@PathParam("a")  int a, @PathParam("b") int b){
        try
        {
            return Response.status(200).entity(a*b).build();
        }
        catch (Exception e)
        {
            return Response.status(500).entity("Exception occurred.").build();
        }
    }
}
