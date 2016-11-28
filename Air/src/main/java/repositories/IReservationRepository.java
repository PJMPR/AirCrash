package repositories;

import java.util.List;

import AirCrash.Air.Reservation;;

public interface IReservationRepository extends IRepository<Reservation> {

	public List<Reservation> withJourneyId(String journeyId);
	public List<Reservation> withPrice(String price);
	public List<Reservation> withNumberOfTickets(String numberOfTickets);
	

}
