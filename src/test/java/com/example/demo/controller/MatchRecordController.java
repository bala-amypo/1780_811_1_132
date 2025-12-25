package com.example.demo.controller;

import com.example.demo.entity.MatchRecord;
import com.example.demo.service.MatchRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchRecordController {

    private final MatchRecordService matchRecordService;

    public MatchRecordController(MatchRecordService matchRecordService) {
        this.matchRecordService = matchRecordService;
    }

    @PostMapping
    public ResponseEntity<MatchRecord> createMatch(
            @RequestParam Long offerId,
            @RequestParam Long requestId) {
        return ResponseEntity.ok(
                matchRecordService.createMatch(offerId, requestId)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatchRecord> getMatch(@PathVariable Long id) {
        return ResponseEntity.ok(matchRecordService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<MatchRecord>> getAllMatches() {
        return ResponseEntity.ok(matchRecordService.getAll());
    }
}
