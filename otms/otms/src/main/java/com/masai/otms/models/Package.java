package com.masai.otms.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;

import java.util.Set;

@Entity
@Data
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer packageId;

    @NotNull(message = "Name Cannot be empty or blank or null")
    @NotEmpty(message = "Name Cannot be empty or blank or null")
    @NotBlank(message = "Name Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Name should be 3 to 20 letters")
    private String packageName;

    @NotNull(message = "Description Cannot be empty or blank or null")
    @NotEmpty(message = "Description Cannot be empty or blank or null")
    @NotBlank(message = "Description Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Description should be 3 to 20 letters")
    private String description;

    @NotNull(message = "Package Type Cannot be empty or blank or null")
    @NotEmpty(message = "Package Type Cannot be empty or blank or null")
    @NotBlank(message = "Package Type Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Package Type should be 3 to 20 letters")
    private String packageType;

    @DecimalMin(value = "0.0", message = "Payment cost must be a positive number")
    private Double paymentCost;

    @NotNull(message = "Payment Details cannot be null")
    @Embedded
    private PaymentDetails paymentDetails;

    @OneToOne(mappedBy = "apackage")
    private Booking booking;

    @OneToMany(mappedBy = "aPackage", cascade = CascadeType.ALL)
    private Set<Travels> travels;
}
