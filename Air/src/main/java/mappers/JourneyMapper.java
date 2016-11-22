package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import AirCrash.Air.Journey;

public class JourneyMapper implements IMapResultSetIntoEntity<Journey>{

	public Journey map(ResultSet rs) throws SQLException {
		Journey journey = new Journey();
		Journey.setId(rs.getInt("id"));
		Journey.setTrack(rs.getString("track"));
		Journey.setDate(rs.getDate("Date"));
		Journey.setTime(rs.getInt("time"));
		Journey.setTickets(rs.getInt("tickets"));
		Journey.setExpectedDuration(rs.getInt("expectedDuration"));
		return journey;
	}

}