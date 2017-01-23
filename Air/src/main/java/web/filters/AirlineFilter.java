package web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import AirCrash.Air.Airline;

@WebFilter(urlPatterns = {"/addAirplane.html","/addJourney.html","/addReservation.html","/addCustormer.html","/final.jsp","/airplaneServlet","/journeyServlet","/reservationServlet","/customerServlet"})
public class AirlineFilter implements Filter {

	public AirlineFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		Airline airline = (Airline) session.getAttribute("airline");
		if(airline==null){
			((HttpServletResponse) response).sendRedirect("/addAirline.html");
		}
		else{
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
