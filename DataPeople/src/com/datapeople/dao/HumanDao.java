package com.datapeople.dao;

import java.util.List;

import com.datapeople.bean.Address;
import com.datapeople.bean.Human;
import com.datapeople.bean.Street;

public interface HumanDao {
	
	List<Human> getAll() throws DaoException;
	
	void addHuman(Human human, Address address, Street street) throws DaoException;

}
