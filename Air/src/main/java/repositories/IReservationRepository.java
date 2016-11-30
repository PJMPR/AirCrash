package repositories;

import java.util.List;

import AirCrash.Air.Reservation;;

public interface IReservationRepository extends IRepository<Reservation> {

	public List<Reservation> withJourneyId(int journeyId);
	public List<Reservation> withPrice(double price);
	public List<Reservation> withNumberOfTickets(int numberOfTickets);
	

}
