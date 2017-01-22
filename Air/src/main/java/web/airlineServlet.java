package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import AirCrash.Air.Airline;

@WebServlet("/airlineServlet")
public class airlineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Airline airline = new Airline();
		airline.setName(request.getParameter("name"));
		airline.setId(0); //ZROBIC DOBRE DODAWANIE ID
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.airline, airline);
	}

}
