package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PackageRepo extends JpaRepository<Package, Integer>{

}