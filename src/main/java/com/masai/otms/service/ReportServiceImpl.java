package com.masai.otms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.otms.exceptions.ReportException;
import com.masai.otms.models.Report;
import com.masai.otms.repository.ReportRepo;
@Service
public class ReportServiceImpl implements ReportService{
	@Autowired
 private ReportRepo reportRepo;
	@Override
	public Report addReport(Report reprt) throws ReportException {
		if(reprt.getReportId()!=null) throw new ReportException("Record not Found");
		Report r1=reportRepo.save(reprt);
		return r1;
	}

	@Override
	public Report deleteReportById(Integer reportId) throws ReportException {
		Optional<Report>  rpt= reportRepo.findById(reportId);
		
		if(rpt.isEmpty()) throw new ReportException("Report not found");
		reportRepo.delete(rpt.get());
		return rpt.get();
	}

	@Override
	public List<Report> viewAllReportsById(Integer reportId) throws ReportException {
		List<Report> reportList= reportRepo.viewAllReportsById(reportId);
		if(reportList.isEmpty())  throw new ReportException("Report not found");
		
		return reportList;
	}

	@Override
	public List<Report> viewAllReports() throws ReportException {
		List<Report> reportList= reportRepo.viewAllReports();
		if(reportList.isEmpty())  throw new ReportException("Report not found");
		
		return reportList;
	}

}
