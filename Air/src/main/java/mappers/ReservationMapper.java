package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import AirCrash.Air.Reservation;

public class ReservationMapper implements IMapResultSetIntoEntity<Reservation>{

	public Reservation map(ResultSet rs) throws SQLException {
		Reservation reservation = new Reservation();
		Reservation.setId(rs.getInt("id"));
		Reservation.setJourneyId(rs.getInt("JourneyId"));
		Reservation.setPrice(rs.getDouble("price"));
		Reservation.setNumberOfTickets(rs.getInt("numberOfTickets"));
		return reservation;
	}

}