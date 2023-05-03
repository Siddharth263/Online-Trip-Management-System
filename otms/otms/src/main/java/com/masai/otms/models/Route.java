package com.masai.otms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer routeId;

    @NotNull(message = "Name Cannot be empty or blank or null")
    @NotEmpty(message = "Name Cannot be empty or blank or null")
    @NotBlank(message = "Name Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Name should be 3 to 20 letters")
    private String routeFrom;

    @NotNull(message = "Name Cannot be empty or blank or null")
    @NotEmpty(message = "Name Cannot be empty or blank or null")
    @NotBlank(message = "Name Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Name should be 3 to 20 letters")
    private String routeTo;

    @NotBlank(message = "Departure date-time is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$", message = "Date-Time Format: yyyy-MM-dd'T'HH:mm:ss (Here T is the separator between date and time")
    private LocalDateTime departureTime;

    @NotBlank(message = "Arrival date-time is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}$", message = "Date-Time Format: yyyy-MM-dd'T'HH:mm:ss (Here T is the separator between date and time")
    private LocalDateTime arrivalTime;

    @NotNull(message = "Date of journey cannot be null")
    @Future(message = "Date of journey must be in the future with format: yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate doj;

    @NotNull(message = "Pickup Point Cannot be empty or blank or null")
    @NotEmpty(message = "Pickup Point Cannot be empty or blank or null")
    @NotBlank(message = "Pickup Point Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Pickup Point should be 3 to 20 letters")
    private String pickupPoint;

    @NotNull(message = "Fare cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Fare should be greater than 0.0")
    private Double fare;
}
