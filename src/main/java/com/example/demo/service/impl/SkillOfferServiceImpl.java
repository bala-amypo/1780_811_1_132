package com.example.demo.service.impl;

import com.example.demo.entity.SkillOffer;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository offerRepository;

    public SkillOfferServiceImpl(SkillOfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public SkillOffer createOffer(SkillOffer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public SkillOffer getById(Long id) {
        return offerRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Skill offer not found"));
    }

    @Override
    public List<SkillOffer> getByProfile(Long profileId) {
        return offerRepository.findByUserId(profileId);
    }

    @Override
    public List<SkillOffer> getAvailable() {
        return offerRepository.findByAvailability("AVAILABLE");
    }
}
