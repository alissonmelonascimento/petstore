package org.acme.petstore.clients;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.acme.petstore.dto.Pet;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v2/pet")
@RegisterRestClient
public interface PetstoreClient {

    @GET
    @Path("/findByStatus")
    @Produces("application/json")
    List<Pet> getByStatus(@QueryParam("status") String status);
    
    @GET
    @Path("/{petId}")
    @Produces("application/json")
    Pet getById(@PathParam("petId") Long petId);    
    
}
