package AirCrash.Air;

import java.sql.Date;

public class Journey implements IHaveId{

	private int Id;
	private String track;
	private Date date;
	private int time;
	private int tickets;
	private int expectedDuration;
	
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
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public int getExpectedDuration() {
		return expectedDuration;
	}
	public void setExpectedDuration(int expectedDuration) {
		this.expectedDuration = expectedDuration;
	}
	
	
	
}
