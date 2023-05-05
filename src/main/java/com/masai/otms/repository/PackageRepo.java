package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Packages;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PackageRepo extends JpaRepository<Packages, Integer> {
	
	@Query("select (p.packageName,p.description, p.packageType, p.paymentCost) from Packages p where p.packageId=?1")
	List<Packages> viewAllPackagesById (Integer packageId);
	
	@Query("select (p.packageName,p.description, p.packageType, p.paymentCost) from Packages p")
	List<Packages> viewAllPackages();
}
