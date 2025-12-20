package com.example.barter.service.impl;

import com.example.barter.entity.MatchRecord;
import com.example.barter.entity.SkillOffer;
import com.example.barter.entity.SkillRequest;
import com.example.barter.exception.ResourceNotFoundException;
import com.example.barter.repository.MatchRecordRepository;
import com.example.barter.repository.SkillOfferRepository;
import com.example.barter.repository.SkillRequestRepository;
import com.example.barter.service.MatchRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchRecordServiceImpl implements MatchRecordService {

    private final MatchRecordRepository matchRepository;
    private final SkillOfferRepository offerRepository;
    private final SkillRequestRepository requestRepository;

    public MatchRecordServiceImpl(MatchRecordRepository matchRepository,
                                  SkillOfferRepository offerRepository,
                                  SkillRequestRepository requestRepository) {
        this.matchRepository = matchRepository;
        this.offerRepository = offerRepository;
        this.requestRepository = requestRepository;
    }

    @Override
    public MatchRecord createMatch(Long offerId, Long requestId) {

        SkillOffer offer = offerRepository.findById(offerId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Skill offer not found"));

        SkillRequest request = requestRepository.findById(requestId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Skill request not found"));

        MatchRecord match = new MatchRecord(offer, request);
        return matchRepository.save(match);
    }

    @Override
    public MatchRecord getById(Long id) {
        return matchRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Match record not found"));
    }

    @Override
    public List<MatchRecord> getAll() {
        return matchRepository.findAll();
    }
}
