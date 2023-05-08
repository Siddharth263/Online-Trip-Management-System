package com.masai.otms.controller;

import com.masai.otms.models.Package;
import com.masai.otms.service.PackageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PackageController {

    @Autowired
    PackageService pServ;

    @PostMapping("/save-package")
    public ResponseEntity<Package> addPackage(@Valid @RequestBody Package p) {
        return ResponseEntity.ok(pServ.addPackage(p));
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deletePackage(@Valid @PathVariable Integer id) {
        return ResponseEntity.ok(pServ.deletePackage(id));
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Package> searchPackage(@Valid @PathVariable Integer id) {
        return ResponseEntity.ok(pServ.searchPackage(id));
    }

    @GetMapping("/all-packages")
    public ResponseEntity<List<Package>> viewAllPackage() {
        return ResponseEntity.ok(pServ.viewAllPackage());
    }
}
