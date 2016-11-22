package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import AirCrash.Air.Airplane;

public class AirplaneMapper implements IMapResultSetIntoEntity<Airplane>{

	public Airplane map(ResultSet rs) throws SQLException {
		Airplane airplane = new Airplane();
		airplane.setId(rs.getInt("id"));
		airplane.setSeats(rs.getInt("seats"));
		airplane.setModel(rs.getString("model"));
		return airplane;
	}

}