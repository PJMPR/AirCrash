package AirCrash.Air;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "airline")
@NamedQueries({ 
		@NamedQuery(name = "airline.all", query = "SELECT a FROM Airline a"),
		@NamedQuery(name = "airline.id", query = "SELECT a FROM Airline a WHERE a.id=:id") })
public class Airline implements IHaveId{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int iD) {
		this.id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
