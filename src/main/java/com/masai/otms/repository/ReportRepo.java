package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Report;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ReportRepo extends JpaRepository<Report, Integer> {
	@Query("select (r.reportName,r.reportType) from Report r where r.reportId=?1")
	List<Report> viewAllReportsById (Integer reportId);
	@Query("select (r.reportName,r.reportType) from Report r")
	List<Report> viewAllReports();
}
