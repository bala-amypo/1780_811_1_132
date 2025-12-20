package com.example.demo.service.impl;

import com.example.demo.entity.MatchRecord;
import com.example.demo.entity.SkillOffer;
import com.example.demo.entity.SkillRequest;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository matchRecordRepository;
    private final SkillOfferRepository skillOfferRepository;
    private final SkillRequestRepository skillRequestRepository;

    public MatchmakingServiceImpl(
            MatchRecordRepository matchRecordRepository,
            SkillOfferRepository skillOfferRepository,
            SkillRequestRepository skillRequestRepository) {
        this.matchRecordRepository = matchRecordRepository;
        this.skillOfferRepository = skillOfferRepository;
        this.skillRequestRepository = skillRequestRepository;
    }

    @Override
    public MatchRecord createMatch(Long offerId, Long requestId) {

        SkillOffer offer = skillOfferRepository.findById(offerId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("SkillOffer not found with id: " + offerId));

        SkillRequest request = skillRequestRepository.findById(requestId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("SkillRequest not found with id: " + requestId));

        MatchRecord matchRecord = new MatchRecord(offer, request);
        return matchRecordRepository.save(matchRecord);
    }

    @Override
    public MatchRecord getMatchById(Long matchId) {
        return matchRecordRepository.findById(matchId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("MatchRecord not found with id: " + matchId));
    }

    @Override
    public List<MatchRecord> getAllMatches() {
        return matchRecordRepository.findAll();
    }
}
