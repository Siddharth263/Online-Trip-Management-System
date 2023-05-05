package com.masai.otms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer hotelId;

    @NotNull(message = "Name Cannot be empty or blank or null")
    @NotEmpty(message = "Name Cannot be empty or blank or null")
    @NotBlank(message = "Name Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Name should be 3 to 20 letters")
    private String hotelName;

    @NotNull(message = "Hotel Type Cannot be empty or blank or null")
    @NotEmpty(message = "Hotel Type Cannot be empty or blank or null")
    @NotBlank(message = "Hotel Type Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Hotel Type should be 3 to 20 letters")
    private String hotelType;

    @NotNull(message = "Description Cannot be empty or blank or null")
    @NotEmpty(message = "Description Cannot be empty or blank or null")
    @NotBlank(message = "Description Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Description should be 3 to 20 letters")
    private String hotelDescription;

    @NotNull(message = "Address Cannot be empty or blank or null")
    @NotEmpty(message = "Address Cannot be empty or blank or null")
    @NotBlank(message = "Address Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Address should be 3 to 20 letters")
    private String address;

    @DecimalMin(value = "0.0", inclusive = false, message = "Rent should be greater than 0.0")
    private Double rent;

    @NotNull(message = "Status Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Status should be 3 to 20 letters")
    private String status;
}
