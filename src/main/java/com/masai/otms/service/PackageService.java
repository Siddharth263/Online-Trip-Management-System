package com.masai.otms.service;

import java.util.List;

import com.masai.otms.exceptions.PackageException;
import com.masai.otms.models.Packages;


public interface PackageService {
	
	public Packages addPackage(Packages packag) throws PackageException;
	public Packages deletePackageById(Integer packageId) throws PackageException;
	public List<Packages> searchPackageByName(String packageName) throws PackageException;
	
	public List<Packages> viewAllPackages () throws PackageException;
}
