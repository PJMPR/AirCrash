package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AirlineDto {

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
