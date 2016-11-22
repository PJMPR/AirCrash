package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import AirCrash.Air.Journey;

public class JourneyMapper implements IMapResultSetIntoEntity<Journey>{

	public Journey map(ResultSet rs) throws SQLException {
		Journey journey = new Journey();
		journey.setId(rs.getInt("id"));
		journey.setTrack(rs.getString("track"));
		journey.setDate(rs.getDate("Date"));
		journey.setTime(rs.getInt("time"));
		journey.setTickets(rs.getInt("tickets"));
		journey.setExpectedDuration(rs.getInt("expectedDuration"));
		return journey;
	}

}