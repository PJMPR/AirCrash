package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import AirCrash.Air.Airplane;
import AirCrash.Air.Reservation;

@WebServlet("/reservationServlet")
public class reservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Reservation reservation = new Reservation();
		reservation.setPrice(Double.parseDouble(request.getParameter("price")));
		reservation.setNumberOfTickets(Integer.parseInt(request.getParameter("numberOfTickets")));
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.reservation, reservation);
		response.sendRedirect("addCustomer.html");
	}

}
