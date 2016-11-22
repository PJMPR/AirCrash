package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import AirCrash.Air.Reservation;

public class ReservationMapper implements IMapResultSetIntoEntity<Reservation>{

	public Reservation map(ResultSet rs) throws SQLException {
		Reservation reservation = new Reservation();
		reservation.setId(rs.getInt("id"));
		reservation.setJourneyId(rs.getInt("JourneyId"));
		reservation.setPrice(rs.getDouble("price"));
		reservation.setNumberOfTickets(rs.getInt("numberOfTickets"));
		return reservation;
	}

}