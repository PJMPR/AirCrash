package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import AirCrash.Air.Airline;
import AirCrash.Air.Airplane;

@WebServlet("/airplaneServlet")
public class airplaneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Airplane airplane = new Airplane();
		airplane.setModel(request.getParameter("model"));
		airplane.setSeats(Integer.parseInt(request.getParameter("seats")));
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.airplane, airplane);
		response.sendRedirect("addJourney.html");
	}

}
