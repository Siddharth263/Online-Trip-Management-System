package com.masai.otms.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

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

    @OneToOne(cascade = CascadeType.ALL)
    private Package apackage;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private Set<Customer> customers;
}
