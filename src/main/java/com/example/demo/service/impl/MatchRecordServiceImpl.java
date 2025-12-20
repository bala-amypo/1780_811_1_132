package com.example.demo.service.impl;

import com.example.demo.entity.MatchRecord;
import com.example.demo.service.MatchRecordService;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchRecordServiceImpl implements MatchRecordService {

    private final MatchmakingService matchmakingService;

    public MatchRecordServiceImpl(MatchmakingService matchmakingService) {
        this.matchmakingService = matchmakingService;
    }

    @Override
    public MatchRecord createMatch(Long offerId, Long requestId) {
        return matchmakingService.createMatch(offerId, requestId);
    }

    @Override
    public MatchRecord getById(Long id) {
        return matchmakingService.getMatchById(id);
    }

    @Override
    public List<MatchRecord> getAll() {
        return matchmakingService.getAllMatches();
    }
}
