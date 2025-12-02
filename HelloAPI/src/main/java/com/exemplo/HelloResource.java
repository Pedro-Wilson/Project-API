package com.exemplo;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Recurso RESTful para o endpoint /hello.
 */
@Path("/hello")
public class HelloResource {

    // Injeta o EJB Stateless (HelloService)
    @Inject
    private HelloService helloService;

    @GET
    @Path("/{name}")
    @Produces (MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("name") String name) {
        // Chama a lógica de negócio encapsulada no EJB
        return helloService.sayHello(name);
    }
}