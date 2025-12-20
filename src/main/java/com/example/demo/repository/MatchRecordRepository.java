package com.example.demo.repository;

import com.example.demo.entity.MatchRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {

    List<MatchRecord> findByOfferId(Long offerId);

    List<MatchRecord> findByRequestId(Long requestId);

    List<MatchRecord> findByStatus(String status);
}
