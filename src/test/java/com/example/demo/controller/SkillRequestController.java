package com.example.demo.controller;

import com.example.demo.entity.SkillRequest;
import com.example.demo.service.SkillRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class SkillRequestController {

    private final SkillRequestService skillRequestService;

    public SkillRequestController(SkillRequestService skillRequestService) {
        this.skillRequestService = skillRequestService;
    }

    @PostMapping
    public ResponseEntity<SkillRequest> createRequest(@RequestBody SkillRequest request) {
        return ResponseEntity.ok(skillRequestService.createRequest(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillRequest> getRequest(@PathVariable Long id) {
        return ResponseEntity.ok(skillRequestService.getById(id));
    }

    @GetMapping("/open")
    public ResponseEntity<List<SkillRequest>> getOpenRequests() {
        return ResponseEntity.ok(skillRequestService.getOpenRequests());
    }
}
