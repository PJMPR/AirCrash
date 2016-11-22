package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import AirCrash.Air.Airplane;

public class AirplaneMapper implements IMapResultSetIntoEntity<Airplane>{

	public Airplane map(ResultSet rs) throws SQLException {
		Airplane airplane = new Airplane();
		Airplane.setId(rs.getInt("id"));
		Airplane.setSeats(rs.getInt("seats"));
		Airplane.setModel(rs.getString("model"));
		return airplane;
	}

}