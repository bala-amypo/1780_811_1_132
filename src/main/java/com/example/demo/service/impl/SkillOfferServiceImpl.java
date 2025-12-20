package com.example.demo.service.impl;

import com.example.barter.entity.SkillOffer;
import com.example.barter.exception.ResourceNotFoundException;
import com.example.barter.repository.SkillOfferRepository;
import com.example.barter.service.SkillOfferService;
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
