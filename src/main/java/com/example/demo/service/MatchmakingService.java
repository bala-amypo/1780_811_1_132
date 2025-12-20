package com.example.barter.service;

import com.example.barter.entity.MatchRecord;

import java.util.List;

public interface MatchRecordService {

    MatchRecord createMatch(Long offerId, Long requestId);

    MatchRecord getById(Long id);

    List<MatchRecord> getAll();
}
