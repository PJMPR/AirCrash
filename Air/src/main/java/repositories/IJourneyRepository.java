package repositories;

import java.sql.Date;
import java.util.List;

import AirCrash.Air.Journey;

public interface IJourneyRepository extends IRepository<Journey> {

	public List<Journey> withTrack(String track);
	public List<Journey> withDate(Date Date);
	public List<Journey> withTime(String time);
	public List<Journey> withTickets(String tickets);
	public List<Journey> withExpectedDuration(String expectedDuration);

}
