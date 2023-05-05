package com.masai.otms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.otms.exceptions.PackageException;
import com.masai.otms.exceptions.ReportException;
import com.masai.otms.models.Packages;
import com.masai.otms.models.Report;
import com.masai.otms.repository.PackageRepo;

public class PackageServiceImpl implements PackageService{

	private PackageRepo packageRepo;

	@Override
	public Packages addPackage(Packages packag) throws PackageException {
        if(packag.getPackageId() != null) throw new PackageException("Package not Found");		
        Packages p1=packageRepo.save(packag);
		return p1;
	}

	@Override
	public Packages deletePackageById(Integer packageId) throws PackageException {
		
Optional<Packages>  pkg= packageRepo.findById(packageId);
		
		if(pkg.isEmpty()) throw new PackageException("Package not found");
		packageRepo.delete(pkg.get());
		return pkg.get();
	}

	@Override
	public List<Packages> searchPackageById(Integer packageId) throws PackageException {
		// TODO Auto-generated method stub
		List<Packages> packageList= packageRepo.viewAllPackagesById(packageId);
		if(packageList.isEmpty())  throw new PackageException("Package not found");
		
		return packageList;
		
	}

	@Override
	public List<Packages> viewAllPackages() throws PackageException {
		List<Packages> packageList= packageRepo.viewAllPackages();
		if(packageList.isEmpty())  throw new ReportException("Report not found");
		
		return packageList;
	}

	
	

}
