package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import AirCrash.Air.Airline;
import AirCrash.Air.Airplane;
import AirCrash.Air.Customer;
import AirCrash.Air.Journey;
import AirCrash.Air.Reservation;
import dao.RepositoryCatalog;
import repositories.IRepositoryCatalog;
import uow.IUnitOfWork;
import uow.UnitOfWork;

@WebServlet("/dbServlet")
public class dbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            IUnitOfWork uow = new UnitOfWork(connection);
            IRepositoryCatalog catalogOf = new RepositoryCatalog(connection, uow);
			HttpSession session = request.getSession();
			Airline airline = (Airline) session.getAttribute("airline");
		    Airplane airplane = (Airplane) session.getAttribute("airplane");
		    Journey journey = (Journey) session.getAttribute("journey");
		    Reservation reservation = (Reservation) session.getAttribute("reservation");
		    Customer customer = (Customer) session.getAttribute("customer");
            catalogOf.Airline().add(airline);
            catalogOf.save();
            catalogOf.Airplane().add(airplane);
            catalogOf.save();
            catalogOf.Journey().add(journey);
            catalogOf.save();
            int journeyId = catalogOf.Journey().getLastId();
            journey.setId(journeyId);
            reservation.setJourney(journey);
            catalogOf.Reservation().add(reservation);
            catalogOf.save();
            catalogOf.Customer().add(customer);
			catalogOf.save();
			session.removeAttribute("airline");
			session.removeAttribute("airplane");
			session.removeAttribute("journey");
			session.removeAttribute("reservation");
			session.removeAttribute("customer");			
			response.sendRedirect("index.html");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
