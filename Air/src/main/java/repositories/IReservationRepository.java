package repositories;

import java.util.List;

import AirCrash.Air.Reservation;;

public interface IReservationRepository extends IRepository<Reservation> {

	public List<Reservation> withName(String name);

}
