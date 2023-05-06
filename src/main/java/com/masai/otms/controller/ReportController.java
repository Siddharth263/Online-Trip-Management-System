package com.masai.otms.controller;

import java.util.List;

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

import com.masai.otms.exceptions.ReportException;
import com.masai.otms.models.Report;
import com.masai.otms.service.ReportService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
public class ReportController {
	
	@Autowired
	private ReportService reportSer;
	@PostMapping("/reports")
	public ResponseEntity<Report>  addPackageHandler(@Valid @RequestBody Report reprt) throws ReportException {
         
		return new ResponseEntity<>(reportSer.addReport(reprt),HttpStatus.CREATED);
	}

	@DeleteMapping("/reports/{reportId}")
	public ResponseEntity<Report> deletePackageByIdHandler(@PathVariable @RequestBody Integer reportId) throws ReportException {

		return new ResponseEntity<>(reportSer.deleteReportById(reportId),HttpStatus.OK);
	}

	@GetMapping("/reports/{reportId}")
	public ResponseEntity<List<Report>> searchReportByIdHandler(@PathVariable Integer reportId) throws ReportException {
	
		
		return new ResponseEntity<>(reportSer.viewAllReportsById(reportId),HttpStatus.OK);
		
	}

	@GetMapping("/reports")
	public ResponseEntity<List<Report>> viewAllPackagesHandler() throws ReportException {
	
		
		return new ResponseEntity<>(reportSer.viewAllReports(),HttpStatus.OK);
	}
}
