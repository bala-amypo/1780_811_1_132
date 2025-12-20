package com.example.demo.service.impl;

import com.example.demo.entity.MatchRecord;
import com.example.demo.entity.SkillOffer;
import com.example.demo.entity.SkillRequest;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.MatchRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchRecordServiceImpl implements MatchRecordService {

    private final MatchRecordRepository matchRecordRepository;
    private final SkillOfferRepository skillOfferRepository;
    private final SkillRequestRepository skillRequestRepository;

    public MatchRecordServiceImpl(
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
                        new ResourceNotFoundException("SkillOffer not found with id " + offerId));

        SkillRequest request = skillRequestRepository.findById(requestId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("SkillRequest not found with id " + requestId));

        MatchRecord matchRecord = new MatchRecord(offer, request);
        return matchRecordRepository.save(matchRecord);
    }

    @Override
    public MatchRecord getById(Long id) {
        return matchRecordRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("MatchRecord not found with id " + id));
    }

    @Override
    public List<MatchRecord> getAll() {
        return matchRecordRepository.findAll();
    }
}
