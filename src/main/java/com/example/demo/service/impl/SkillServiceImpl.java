package com.example.demo.service.impl;

import com.example.demo.entity.Skill;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.SkillRepository;
import com.example.demo.service.SkillService;
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
