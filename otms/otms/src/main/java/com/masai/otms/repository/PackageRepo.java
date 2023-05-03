package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepo extends JpaRepository<Package, Integer> {
}
