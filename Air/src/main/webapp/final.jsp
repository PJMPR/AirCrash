<%@page import="AirCrash.Air.Customer"%>
<%@page import="AirCrash.Air.Reservation"%>
<%@page import="AirCrash.Air.Journey"%>
<%@page import="AirCrash.Air.Airline"%>
<%@page import="AirCrash.Air.Airplane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	    Airline airline = (Airline) session.getAttribute("airline");
	    Airplane airplane = (Airplane) session.getAttribute("airplane");
	    Journey journey = (Journey) session.getAttribute("journey");
	    Reservation reservation = (Reservation) session.getAttribute("reservation");
	    Customer customer = (Customer) session.getAttribute("customer");
	%>
	<h1>Linia: <%=airline.getName() %></h1>
	<h1>Samolot:</h1>
	<h2>Model:  <%=airplane.getModel() %></h2>
	<h2>Ilość siedzeń:  <%=airplane.getSeats() %></h2>
	<h1>Przelot:</h1>
	<h2>Do:  <%=journey.getTrack() %></h2>
	<h2>Data:  <%=journey.getDate() %></h2>
	<h2>Czas lotu:  <%=journey.getExpectedDuration() %></h2>
	<h2>Ilość miejsc:  <%=journey.getTickets() %></h2>
	<h1>Rezerwacja:</h1>
	<h2>Cena:  <%=reservation.getPrice() %></h2>
	<h2>Ilość biletów:  <%=reservation.getNumberOfTickets() %></h2>
	<h1>Klient:</h1>
	<h2>Imie:  <%=customer.getName() %></h2>
	<h2>Nazwisko:  <%=customer.getSurname() %></h2>
	<form action="dbServlet" method="get">
	<input type="submit" value="Wyślij">
	</form>
</body>
</html>