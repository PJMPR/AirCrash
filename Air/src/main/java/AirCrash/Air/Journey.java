package AirCrash.Air;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "journey")
@NamedQueries({ 
		@NamedQuery(name = "journey.all", query = "SELECT j FROM Journey j"),
		@NamedQuery(name = "journey.id", query = "SELECT j FROM Journey j WHERE j.id=:id") })
public class Journey implements IHaveId{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String track;
	private Date date;
	private int tickets;
	private double expectedDuration;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public double getExpectedDuration() {
		return expectedDuration;
	}
	public void setExpectedDuration(double expectedDuration) {
		this.expectedDuration = expectedDuration;
	}
	
}
