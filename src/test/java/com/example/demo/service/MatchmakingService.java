package com.example.demo.service;

import com.example.demo.entity.MatchRecord;
import java.util.List;

public interface MatchmakingService {

    MatchRecord generateMatch(Long requestId);

    List<MatchRecord> getMatchesForUser(Long userId);
}
