package in.glootech.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MedicineDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medicineId;
	private String medicineName;
	private String medicineCategory;
	private LocalDate manufactureDate;
	private LocalDate expirationDate;
	private Integer quantity;
	private String companyName;
	private Double medicinePrice;
	private Integer medicalStoreId;
	private Integer ngoId;
	@CreationTimestamp
	private LocalDate registerationDate;
	
}
