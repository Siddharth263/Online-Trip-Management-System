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
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer feedbackId;

    @NotNull(message = "Feedback Cannot be empty or blank or null")
    @NotEmpty(message = "Feedback Cannot be empty or blank or null")
    @NotBlank(message = "Feedback Cannot be empty or blank or null")
    @Size(min = 3, max = 20, message = "Feedback should be 3 to 20 letters")
    private String feedback;

    @DecimalMax(value = "5.0", message = "Give rating from 1.0 to 5.0")
    private Double rating;

    @FutureOrPresent
    private LocalDate submitDate;
}
