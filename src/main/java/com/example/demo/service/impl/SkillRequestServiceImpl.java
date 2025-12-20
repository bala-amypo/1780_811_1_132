package com.example.demo.service.impl;

import com.example.demo.entity.SkillRequest;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.service.SkillRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

    private final SkillRequestRepository requestRepository;

    public SkillRequestServiceImpl(SkillRequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public SkillRequest createRequest(SkillRequest request) {
        return requestRepository.save(request);
    }

    @Override
    public SkillRequest getById(Long id) {
        return requestRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Skill request not found"));
    }

    @Override
    public List<SkillRequest> getOpenRequests() {
        return requestRepository.findByStatus("OPEN");
    }
}
