package com.masai.otms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.otms.exceptions.PackageException;
import com.masai.otms.exceptions.ReportException;
import com.masai.otms.models.Packages;
import com.masai.otms.repository.PackageRepo;
import com.masai.otms.service.PackageService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
public class PackageController {
	@Autowired
	private PackageService packagSer;
	@PostMapping("/packagess")
	public ResponseEntity<Packages>  addPackageHandler(@Valid @RequestBody Packages packag) throws PackageException {
         
		return new ResponseEntity<>(packagSer.addPackage(packag),HttpStatus.CREATED);
	}

	@DeleteMapping("/packagess/{packageId}")
	public ResponseEntity<Packages> deletePackageByIdHandler(@PathVariable @RequestBody Integer packageId) throws PackageException {

		return new ResponseEntity<>(packagSer.deletePackageById(packageId),HttpStatus.OK);
	}

	@GetMapping("/packagess/{packageId}")
	public ResponseEntity<List<Packages>> searchPackageByIdHandler(@PathVariable String packageName) throws PackageException {
	
		
		return new ResponseEntity<>(packagSer.searchPackageByName(packageName),HttpStatus.OK);
		
	}

	@GetMapping("/packagess")
	public ResponseEntity<List<Packages>> viewAllPackagesHandler() throws PackageException {
	
		
		return new ResponseEntity<>(packagSer.viewAllPackages(),HttpStatus.OK);
	}
}
