package com.example.demo.repository;

import com.example.demo.entity.MatchRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {

    List<MatchRecord> findByUserA_IdOrUserB_Id(Long userAId, Long userBId);
}
