package com.uit.website_ban_sach.repository;

import com.uit.website_ban_sach.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    public List<Feedback> findAllBySachId(Long id);
}
