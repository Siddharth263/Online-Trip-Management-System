package com.masai.otms.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;

@Entity
@Data
public class Packages {

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

	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public Double getPaymentCost() {
		return paymentCost;
	}

	public void setPaymentCost(Double paymentCost) {
		this.paymentCost = paymentCost;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "Packages [packageId=" + packageId + ", packageName=" + packageName + ", description=" + description
				+ ", packageType=" + packageType + ", paymentCost=" + paymentCost + ", paymentDetails=" + paymentDetails
				+ "]";
	}

	
    
}
