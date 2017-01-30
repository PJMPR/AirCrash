package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import AirCrash.Air.Journey;
import rest.dto.JourneyDto;

@Path("/journeys")
@Stateless
public class JourneyResources {
	
    Mapper mapper = new DozerBeanMapper();
    
    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<JourneyDto> result = new ArrayList<JourneyDto>();
    	for(Journey j: entityManager.createNamedQuery("journey.all", Journey.class).getResultList()){
        	result.add(mapper.map(j, JourneyDto.class));
        }
        return Response.ok(new GenericEntity<List<JourneyDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Journey result = entityManager.createNamedQuery("journey.id", Journey.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
	
}