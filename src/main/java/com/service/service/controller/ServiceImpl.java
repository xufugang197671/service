package com.service.service.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-24T02:30:50.412Z")

@RestSchema(schemaId = "service")
@RequestMapping(path = "/service", produces = MediaType.APPLICATION_JSON)
public class ServiceImpl {

    @Autowired
    private ServiceDelegate userServiceDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userServiceDelegate.helloworld(name);
    }

}
