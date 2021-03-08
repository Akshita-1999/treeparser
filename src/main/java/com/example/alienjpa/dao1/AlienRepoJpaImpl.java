package com.example.alienjpa.dao1;

import com.example.alienjpa.AlienJpa;
import com.example.alienjpa.mapper.AlienRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlienRepoJpaImpl implements AlienRepoJpa{
    public AlienRepoJpaImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<AlienJpa> findAll() {
        List<AlienJpa> list = template.query("select * from Alien", new AlienRowMapper());
        System.out.println("hi");
        return list;
    }
}
