package toan.molet.garageManager.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vehicle {

	@Id
	private Integer id;

	private Long mileage;

	private String make;
	private String model;
	private String year;
	private String vin;
	@ManyToOne
	private Client client;
	@OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<WorkOrder> workOrders;
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Vehicle wo = (Vehicle) obj;
		return Objects.equals(id, wo.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}
