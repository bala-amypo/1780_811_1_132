package com.example.demo.service;

import com.example.demo.entity.SkillRequest;
import java.util.List;

public interface SkillRequestService {

    SkillRequest createRequest(SkillRequest request);

    SkillRequest getRequestById(Long id);

    List<SkillRequest> getRequestsByUser(Long userId);

    List<SkillRequest> getAllRequests();

    void deleteRequest(Long id);
}
