package com.example.alienjpa.controller1;

import java.util.List;

import javax.annotation.Resource;

import com.example.alienjpa.service.AlienJpaService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import com.example.alienjpa.AlienJpa;


@Controller
@RequestMapping


public class AlienJpaController {

    @Resource
    AlienJpaService alienJpaService;

    @GetMapping
    public List<AlienJpa> getAlienJpas() {
        return alienJpaService.findAll();
    }
}
