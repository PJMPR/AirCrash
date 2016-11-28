package repositories;

import java.util.List;

import AirCrash.Air.Airline;

public interface IAirlineRepository extends IRepository<Airline> {

	public List<Airline> withSurname(String name);

}
