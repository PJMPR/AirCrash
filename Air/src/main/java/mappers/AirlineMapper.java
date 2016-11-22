package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import AirCrash.Air.Airline;

public class AirlineMapper implements IMapResultSetIntoEntity<Airline>{

	public Airline map(ResultSet rs) throws SQLException {
		Airline airline = new Airline();
		Airline.setId(rs.getInt("id"));
		Airline.setName(rs.getString("name"));
		return airline;
	}

}