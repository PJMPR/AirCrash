package dao;

import java.sql.Connection;

import mappers.AirlineMapper;
import mappers.AirplaneMapper;
import mappers.CustomerMapper;
import mappers.JourneyMapper;
import mappers.ReservationMapper;
import repositories.IAirlineRepository;
import repositories.IAirplaneRepository;
import repositories.ICustomerRepository;
import repositories.IJourneyRepository;
import repositories.IRepositoryCatalog;
import repositories.IReservationRepository;
import uow.IUnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog {

	private Connection connection;
	private IUnitOfWork uow;

	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	public IAirlineRepository Airline() {
		return new AirlineRepository(connection, new AirlineMapper(), uow);
	}

	public IAirplaneRepository Airplane() {
		return new AirplaneRepository(connection,
				new AirplaneMapper(), uow);
	}

	public ICustomerRepository Customer() {
		return new CustomerRepository(connection, new CustomerMapper(), uow);
	}

	public IJourneyRepository Journey() {
		return new JourneyRepository(connection, new JourneyMapper(), uow);
	}
	public IReservationRepository Reservation() {
		return new ReservationRepository(connection, new ReservationMapper(), uow);
	}

	public void save() {
		uow.saveChanges();
	}
}
