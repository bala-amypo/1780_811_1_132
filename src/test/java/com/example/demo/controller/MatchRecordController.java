package com.example.demo.controller;

import com.example.demo.entity.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {

    @Autowired
    private MatchmakingService matchmakingService;

    @PostMapping("/generate/{requestId}")
    public ResponseEntity<MatchRecord> generate(@PathVariable Long requestId) {
        return ResponseEntity.ok(matchmakingService.generateMatch(requestId));
    }
}
