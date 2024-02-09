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
public class DonerDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer donerId;
    private String fullName;
    private String streetAddress;
    private String city;
    private String state;
    private Integer postalCode;
    private String country;
    private String email;
    private Long mobile;
    private Double donationAmount;
    @CreationTimestamp
    private LocalDate registerDate;
}
