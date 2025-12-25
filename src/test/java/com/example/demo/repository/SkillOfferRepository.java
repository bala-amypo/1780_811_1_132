package com.example.demo.repository;

import com.example.demo.entity.SkillOffer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillOfferRepository extends JpaRepository<SkillOffer, Long> {

    List<SkillOffer> findByUserId(Long userId);

    List<SkillOffer> findBySkillId(Long skillId);

    List<SkillOffer> findByAvailability(String availability);
}
