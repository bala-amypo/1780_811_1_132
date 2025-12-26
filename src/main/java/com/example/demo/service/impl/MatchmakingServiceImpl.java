package com.example.demo.service.impl;

import com.example.demo.model.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    private final MatchRecordRepository matchRecordRepository;

    public MatchmakingServiceImpl(MatchRecordRepository matchRecordRepository) {
        this.matchRecordRepository = matchRecordRepository;
    }

    @Override
    public MatchRecord generateMatch(Long requestId) {
        // Simplified logic for demo purposes
        MatchRecord match = new MatchRecord();
        match.setStatus("PENDING");
        return matchRecordRepository.save(match);
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return matchRecordRepository.findByUserAIdOrUserBId(userId, userId);
    }
}
