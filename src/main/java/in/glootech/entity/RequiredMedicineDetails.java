package in.glootech.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RequiredMedicineDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestId;
	private String medicineName;
	private String medicineCategory;
	private Integer quantityRequired;
	private Integer ngoId;
    //optional: private String requestReason; 
	@CreationTimestamp
	private LocalDate requestDate;
	private String requestStatus;//default: pending,approved,fulfilled
	
}
