package repositories;

import java.util.List;

import AirCrash.Air.Journey;

public interface IJourneyRepository extends IRepository<Journey> {

	public List<Journey> withName(String name);

}
