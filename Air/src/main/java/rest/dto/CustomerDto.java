package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerDto {

	private int Id;
	private String name;
	private String surname;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
    
}
