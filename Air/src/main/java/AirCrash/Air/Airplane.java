package AirCrash.Air;

public class Airplane implements IHaveId{

	private int Id;
	private int seats;
	private String model;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
