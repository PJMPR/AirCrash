package AirCrash.Air;

import java.sql.Date;

public class Journey implements IHaveId{

	private int Id;
	private String track;
	private Date date;
	private int tickets;
	private double expectedDuration;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
