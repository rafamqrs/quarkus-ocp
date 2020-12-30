package com.lab.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/car")
public class CarResouce {

    @GET
    public String test(){
        return "Teste";
    }
    
}