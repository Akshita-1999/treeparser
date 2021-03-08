package com.example.alienjpa.service;

import java.util.List;

import javax.annotation.Resource;

import com.example.alienjpa.AlienJpa;
import com.example.alienjpa.dao1.AlienRepoJpa;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AlienJpaServiceImpl implements AlienJpaService {
    @Resource
    AlienRepoJpa alienRepoJpa;

    @Override
    public List<AlienJpa> findAll() {
        return alienRepoJpa.findAll();
    }
}
