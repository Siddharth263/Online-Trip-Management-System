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
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookingId;

    @NotNull(message = "Booking Type Cannot be empty or blank or null")
    @NotEmpty(message = "Booking Type Cannot be empty or blank or null")
    @NotBlank(message = "Booking Type Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Booking Type should be 3 to 20 letters")
    private String bookingType;

    @NotNull(message = "Booking Title Cannot be empty or blank or null")
    @NotEmpty(message = "Booking Title Cannot be empty or blank or null")
    @NotBlank(message = "Booking Title Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Booking Title should be 3 to 20 letters")
    private String bookingTitle;

    @FutureOrPresent(message = "Booking date must be in the future or present")
    private LocalDate bookingDate;
}
