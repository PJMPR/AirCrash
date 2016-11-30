package repositories;

import java.sql.Date;
import java.util.List;

import AirCrash.Air.Journey;

public interface IJourneyRepository extends IRepository<Journey> {

	public List<Journey> withTrack(String track);
	public List<Journey> withDate(Date Date);
	public List<Journey> withTime(int time);
	public List<Journey> withTickets(int tickets);
	public List<Journey> withExpectedDuration(int expectedDuration);

}
