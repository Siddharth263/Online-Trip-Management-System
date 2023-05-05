package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {
}
