package com.example.barter.service.impl;

import com.example.barter.entity.Skill;
import com.example.barter.exception.ResourceNotFoundException;
import com.example.barter.repository.SkillRepository;
import com.example.barter.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill create(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill getById(Long id) {
        return skillRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Skill not found"));
    }

    @Override
    public List<Skill> getAll() {
        return skillRepository.findAll();
    }
}
