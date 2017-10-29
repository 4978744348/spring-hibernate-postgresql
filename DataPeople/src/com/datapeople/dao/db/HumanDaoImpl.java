package com.datapeople.dao.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.datapeople.bean.Address;
import com.datapeople.bean.Human;
import com.datapeople.bean.Street;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.HumanDao;

public class HumanDaoImpl implements HumanDao {
	
	private DataSource datasource;
	
	private String SECECT_HUMAN_ALL = "SELECT *  FROM human";
	
	
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
	public void addHuman(Human human, Address address, Street street) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	


}
