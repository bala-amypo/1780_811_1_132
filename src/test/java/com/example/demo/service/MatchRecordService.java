package com.example.demo.service;

import com.example.demo.entity.MatchRecord;
import java.util.List;

public interface MatchRecordService {

    MatchRecord save(MatchRecord matchRecord);

    MatchRecord getById(Long id);

    List<MatchRecord> getAll();
}
