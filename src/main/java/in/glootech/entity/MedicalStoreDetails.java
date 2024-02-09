package in.glootech.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "medical_store_details")
@Data
public class MedicalStoreDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicalStoreId;

    private String medicalStoreName;
    private String streetAddress;
    private String city;
    private String state;
    private Integer postalCode;
    private String medicalStoreType;
    private String medicalStoreLicenseNumber;
    private LocalDate establishedDate;
    private String ownerName;
    
    private String contactPersonName;
    private Long contactPersonAadhar;
    private String contactPersonEmail;
    private Long contactPersonPhoneNumber;

    private String password;
    private String validity;

    @Lob
    private byte[] medicalStoreLicenseProof;

    @Lob
    private byte[] medicalStoreAddressProof;

    @Lob
    private byte[] contactPersonIdProof;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate createDate;

    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDate updateDate;
}
