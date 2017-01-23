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

import AirCrash.Air.Airplane;

@WebFilter(urlPatterns = {"/addJourney.html","/addReservation.html","/addCustormer.html","/final.jsp","/journeyServlet","/reservationServlet","/customerServlet"})
public class AirplaneFilter implements Filter {

	public AirplaneFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		Airplane airplane = (Airplane) session.getAttribute("airplane");
		if(airplane==null){
			((HttpServletResponse) response).sendRedirect("/addAirplane.html");
		}
		else{
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
