package com.example.demo.repository;

import com.example.demo.entity.SkillOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillOfferRepository extends JpaRepository<SkillOffer, Long> {

    List<SkillOffer> findByUser_Id(Long userId);
}
