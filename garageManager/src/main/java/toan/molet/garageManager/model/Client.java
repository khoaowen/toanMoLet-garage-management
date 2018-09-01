package toan.molet.garageManager.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	@OneToMany(mappedBy = "Vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
	List<Vehicle> vehicles;

}
