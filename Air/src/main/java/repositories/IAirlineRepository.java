package repositories;

import java.util.List;

import AirCrash.Air.Airline;

public interface IAirlineRepository extends IRepository<Airline> {

	public List<Airline> withName(String name);
	public List<Airline> withSurname(String surname);

}
