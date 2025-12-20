package com.example.demo.controller;

import com.example.demo.entity.SkillOffer;
import com.example.demo.service.SkillOfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class SkillOfferController {

    private final SkillOfferService skillOfferService;

    public SkillOfferController(SkillOfferService skillOfferService) {
        this.skillOfferService = skillOfferService;
    }

    @PostMapping
    public ResponseEntity<SkillOffer> createOffer(@RequestBody SkillOffer offer) {
        return ResponseEntity.ok(skillOfferService.createOffer(offer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SkillOffer> getOffer(@PathVariable Long id) {
        return ResponseEntity.ok(skillOfferService.getById(id));
    }

    @GetMapping("/profile/{profileId}")
    public ResponseEntity<List<SkillOffer>> getByProfile(@PathVariable Long profileId) {
        return ResponseEntity.ok(skillOfferService.getByProfile(profileId));
    }

    @GetMapping("/available")
    public ResponseEntity<List<SkillOffer>> getAvailable() {
        return ResponseEntity.ok(skillOfferService.getAvailable());
    }
}
