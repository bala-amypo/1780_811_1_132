package com.example.demo.service;

import com.example.demo.entity.SkillRequest;

import java.util.List;

public interface SkillRequestService {

    SkillRequest createRequest(SkillRequest request);

    SkillRequest getById(Long id);

    List<SkillRequest> getOpenRequests();
}
