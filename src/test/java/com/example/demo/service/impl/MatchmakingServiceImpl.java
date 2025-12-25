package com.example.demo.service.impl;

import com.example.demo.entity.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    @Override
    public MatchRecord generateMatch(Long requestId) {
        MatchRecord record = new MatchRecord();
        record.setStatus("PENDING");
        return record;
    }

    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return new ArrayList<>();
    }
}
