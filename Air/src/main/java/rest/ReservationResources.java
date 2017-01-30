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

import AirCrash.Air.Reservation;
import rest.dto.ReservationDto;

@Path("/reservations")
@Stateless
public class ReservationResources {
	
    Mapper mapper = new DozerBeanMapper();
    
    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<ReservationDto> result = new ArrayList<ReservationDto>();
    	for(Reservation j: entityManager.createNamedQuery("reservation.all", Reservation.class).getResultList()){
        	result.add(mapper.map(j, ReservationDto.class));
        }
        return Response.ok(new GenericEntity<List<ReservationDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Reservation result = entityManager.createNamedQuery("reservation.id", Reservation.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
	
}