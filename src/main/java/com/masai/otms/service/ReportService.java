package com.masai.otms.service;

import java.util.List;

import com.masai.otms.exceptions.ReportException;
import com.masai.otms.models.Report;

public interface ReportService {
	public Report addReport(Report reprt) throws ReportException;
	public Report deleteReportById(Integer reportId) throws ReportException;
	public List<Report> viewAllReportsById (Integer reportId) throws ReportException;
	
	public List<Report> viewAllReports () throws ReportException;
	
}
