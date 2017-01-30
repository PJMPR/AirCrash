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

import AirCrash.Air.Airplane;
import rest.dto.AirplaneDto;


@Path("/airplanes")
@Stateless
public class AirplaneResources {
	
    Mapper mapper = new DozerBeanMapper();
    
    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<AirplaneDto> result = new ArrayList<AirplaneDto>();
    	for(Airplane a: entityManager.createNamedQuery("airplane.all", Airplane.class).getResultList()){
        	result.add(mapper.map(a, AirplaneDto.class));
        }
        return Response.ok(new GenericEntity<List<AirplaneDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Airplane result = entityManager.createNamedQuery("airplane.id", Airplane.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
	
}