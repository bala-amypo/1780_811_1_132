package com.example.demo.service;

import com.example.barter.entity.SkillOffer;

import java.util.List;

public interface SkillOfferService {

    SkillOffer createOffer(SkillOffer offer);

    SkillOffer getById(Long id);

    List<SkillOffer> getByProfile(Long profileId);

    List<SkillOffer> getAvailable();
}
