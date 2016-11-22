package AirCrash.Air;

public class Airline implements IHaveId{
	
	private int Id;
	private String name;
	
	public int getId() {
		return Id;
	}
	public void setId(int iD) {
		Id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
