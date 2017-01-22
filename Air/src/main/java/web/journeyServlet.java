package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import AirCrash.Air.Journey;

/**
 * Servlet implementation class journeyServlet
 */
@WebServlet("/journeyServlet")
public class journeyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Journey journey = new Journey();
		journey.setTrack(request.getParameter("track"));
		journey.setDate(request.getParameter("date"));
		journey.setTickets(request.getParameter("tickets"));
		journey.setExpectedDuration(request.getParameter("expectedDuration"));
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.journey, journey);
		
	}

}
