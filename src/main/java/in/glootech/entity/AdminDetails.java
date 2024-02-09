package in.glootech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AdminDetails {
	@Id
	private Integer adminId;
	private String username;
	private String password;
}
