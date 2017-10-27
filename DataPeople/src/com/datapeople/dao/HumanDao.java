package com.datapeople.dao;

import java.util.List;

import com.datapeople.bean.Human;

public interface HumanDao {
	
	List<Human> getAll() throws DaoException;
	
	List<Human> getAllById(long id) throws DaoException;

}
