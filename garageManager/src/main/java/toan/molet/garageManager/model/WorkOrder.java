package toan.molet.garageManager.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class WorkOrder {

	@Id
	private Integer id;

	/**
	 * Date when work is started
	 */
	private LocalDate roDate;
	private String note;

	@ManyToOne
	private Vehicle vehicle;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		WorkOrder wo = (WorkOrder) obj;
		return Objects.equals(id, wo.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
