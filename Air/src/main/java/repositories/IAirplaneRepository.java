package repositories;

import java.util.List;

import AirCrash.Air.Airplane;

public interface IAirplaneRepository extends IRepository<Airplane> {

	public List<Airplane> withName(String seats);
	public List<Airplane> withSurname(String model);

}
