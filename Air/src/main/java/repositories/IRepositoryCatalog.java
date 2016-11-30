package repositories;

public interface IRepositoryCatalog {

	public IAirplaneRepository Airplane();
	public IAirlineRepository Airline();
	public ICustomerRepository Customer();
	public IJourneyRepository Journey();
	public IReservationRepository Reservation();
}
