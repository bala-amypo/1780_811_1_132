package com.example.demo.service.impl;

import com.example.demo.entity.MatchRecord;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.service.MatchRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchRecordServiceImpl implements MatchRecordService {

    private final MatchRecordRepository repository;

    public MatchRecordServiceImpl(MatchRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public MatchRecord save(MatchRecord matchRecord) {
        return repository.save(matchRecord);
    }

    @Override
    public MatchRecord getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("MatchRecord not found"));
    }

    @Override
    public List<MatchRecord> getAll() {
        return repository.findAll();
    }
}
