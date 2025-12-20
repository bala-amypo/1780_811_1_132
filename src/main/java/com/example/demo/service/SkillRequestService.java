package com.example.barter.service;

import com.example.barter.entity.SkillRequest;

import java.util.List;

public interface SkillRequestService {

    SkillRequest createRequest(SkillRequest request);

    SkillRequest getById(Long id);

    List<SkillRequest> getOpenRequests();
}
