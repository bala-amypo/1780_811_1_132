package com.example.demo.service.impl;

import com.example.demo.entity.SkillOffer;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.service.SkillOfferService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillOfferServiceImpl implements SkillOfferService {

    private final SkillOfferRepository repository;

    public SkillOfferServiceImpl(SkillOfferRepository repository) {
        this.repository = repository;
    }

    @Override
    public SkillOffer createOffer(SkillOffer offer) {
        return repository.save(offer);
    }

    @Override
    public SkillOffer getOfferById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Offer not found"));
    }

    @Override
    public List<SkillOffer> getOffersByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<SkillOffer> getAllOffers() {
        return repository.findAll();
    }

    @Override
    public void deleteOffer(Long id) {
        repository.deleteById(id);
    }
}
