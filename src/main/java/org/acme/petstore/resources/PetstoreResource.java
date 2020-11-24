package org.acme.petstore.resources;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.petstore.audit.model.Audit;
import org.acme.petstore.audit.repository.AuditRepository;
import org.acme.petstore.clients.PetstoreClient;
import org.acme.petstore.dto.Pet;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/petstore")
public class PetstoreResource {

	@Inject
	@RestClient
    PetstoreClient petstoreClient;
    
    @Inject
    AuditRepository auditRepository;


	@Transactional
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pet> findByStatus(@QueryParam("status") String status){
        boolean success = true;

        Audit aud = new Audit();
        aud.setService("FIND_PET_BY_STATUS");
        try{
            return petstoreClient.getByStatus(status);
        }catch(Exception e){
            success = false;
            throw e;
        }finally{
            aud.setSuccess(success);

            try{
                auditRepository.save(aud);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

	@Transactional
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pet findById(@PathParam("id") Long id){
        boolean success = true;

        Audit aud = new Audit();
        aud.setService("FIND_PET_BY_ID");
        try{
            return petstoreClient.getById(id);
        }catch(Exception e){
            success = false;
            throw e;
        }finally{
            aud.setSuccess(success);

            try{
                auditRepository.save(aud);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }    
}