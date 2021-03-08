package com.example.alienjpa.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.alienjpa.AlienJpa;
import org.springframework.jdbc.core.RowMapper;

public class AlienRowMapper implements RowMapper<AlienJpa> {

    @Override
    public AlienJpa mapRow(ResultSet rs, int arg1) throws SQLException {
        AlienJpa ali = new AlienJpa();
        ali.setaId(rs.getInt("aId"));
        ali.setaName(rs.getString("aName"));
        return ali;
    }


}
