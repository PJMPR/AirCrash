package repositories;

import java.util.List;

import AirCrash.Air.Airplane;

public interface IAirplaneRepository extends IRepository<Airplane> {

	public List<Airplane> withSeats(String seats);
	public List<Airplane> withModel(String model);

}
