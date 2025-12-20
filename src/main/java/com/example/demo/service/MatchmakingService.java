package com.example.demo.service;

import com.example.demo.entity.MatchRecord;
import java.util.List;

public interface MatchmakingService {

    MatchRecord createMatch(Long offerId, Long requestId);

    MatchRecord getMatchById(Long matchId);

    List<MatchRecord> getAllMatches();
}
