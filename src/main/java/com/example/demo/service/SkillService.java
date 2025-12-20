package com.example.barter.service;

import com.example.barter.entity.Skill;

import java.util.List;

public interface SkillService {

    Skill create(Skill skill);

    Skill getById(Long id);

    List<Skill> getAll();
}
