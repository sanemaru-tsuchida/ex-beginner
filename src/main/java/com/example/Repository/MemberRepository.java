package com.example.Repository;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;


import com.example.domain.Menber;

import org.springframework.jdbc.core.RowMapper;

@Repository
public class MemberRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Menber> ROW_MAPPER = (rs,i) -> {
		Menber menber = new Menber();
		menber.setId(rs.getInt("id"));
		menber.setName(rs.getString("name"));
		menber.setAge(rs.getInt("age"));
		menber.setDepId(rs.getString("dep_id"));
		return menber;
	};
	public List<Menber> findAll(String name) {

		String sql = "SELECT id,name,age,dep_id FROM members WHERE name LIKE :name";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name","%"+name+"%");
		List<Menber> menber = template.query(sql, param, ROW_MAPPER);
		
		return menber;
	}
	

}
