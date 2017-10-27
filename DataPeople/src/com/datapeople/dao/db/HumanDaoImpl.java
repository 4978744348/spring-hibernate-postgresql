package com.datapeople.dao.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.datapeople.bean.Human;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.HumanDao;

public class HumanDaoImpl implements HumanDao {
	
	private DataSource datasource;
	private String SECECT_HUMAN_ALL = "SELECT *  FROM human";
	private String SECECT_HUMAN_BY_ID = "SELECT id, Human, name, middle_name, sex, "
			+ "birth_date, birth_date FROM human WHERE id = ?";
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public List<Human> getAll() throws DaoException {
		JdbcTemplate template = new JdbcTemplate(datasource);
		List<Human> human = template.query(SECECT_HUMAN_ALL, new BeanPropertyRowMapper<Human>(Human.class));
		return human;
	}

	@Override
	public List<Human> getAllById(long id) throws DaoException {
		JdbcTemplate template = new JdbcTemplate(datasource);
		List<Human> humanList = template.query(SECECT_HUMAN_BY_ID, new BeanPropertyRowMapper<Human>(Human.class), id);
		return humanList;
	}

}
