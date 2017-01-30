package AirCrash.Air;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

import dao.RepositoryCatalog;
import repositories.IRepositoryCatalog;
import uow.IUnitOfWork;
import uow.UnitOfWork;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Airline LOT = new Airline();
    	LOT.setName("LOT");
    	
    	Airplane Boeing = new Airplane();
    	Boeing.setModel("747");
    	Boeing.setSeats(50);
    	
    	
    	Date d = new Date(116,9,10);

    	
    	Journey Gdansk = new Journey();
    	Gdansk.setTrack("Gdańsk");
    	Gdansk.setDate(d);
    	Gdansk.setExpectedDuration(2);
    	Gdansk.setTickets(50);
    	
    	Reservation rez1 = new Reservation();
    	rez1.setNumberOfTickets(3);
    	rez1.setPrice(40.50);
    	
    	Customer Arek = new Customer();
    	Arek.setName("Arek");
    	Arek.setSurname("Stankiewicz");
    	
    	 try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            IUnitOfWork uow = new UnitOfWork(connection);
            IRepositoryCatalog catalogOf = new RepositoryCatalog(connection, uow);
            List<Customer> customer = catalogOf.Customer().withName("asfa");
            catalogOf.Airline().add(LOT);
            catalogOf.Airplane().add(Boeing);
            catalogOf.Journey().add(Gdansk);
            catalogOf.Reservation().add(rez1);
            catalogOf.Customer().add(Arek);
            catalogOf.save();
         } catch (SQLException e) {
             e.printStackTrace();
         }
    	 
    }
}
