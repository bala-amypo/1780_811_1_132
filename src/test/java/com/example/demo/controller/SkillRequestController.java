package com.example.demo.controller;

import com.example.demo.entity.SkillRequest;
import com.example.demo.service.SkillRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skill-requests")
public class SkillRequestController {

    @Autowired
    private SkillRequestService skillRequestService;

    @PostMapping
    public ResponseEntity<SkillRequest> create(@RequestBody SkillRequest request) {
        return ResponseEntity.ok(skillRequestService.createRequest(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillRequest> get(@PathVariable Long id) {
        return ResponseEntity.ok(skillRequestService.getRequestById(id));
    }
}
