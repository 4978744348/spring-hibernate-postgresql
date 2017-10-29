package com.datapeople.dao.db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.datapeople.bean.Human;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.HumanDao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.swing.*;



public class HumanDaoImplHibernate implements HumanDao{
	
	
	@Override
	public List<Human> getAll() throws DaoException {
		
		Session session = null;
	    List busses = new ArrayList<Human>();
	    try {
	      session = HibernateCongigurator.getSessionFactory().openSession();
	      busses = session.createCriteria(Human.class).list();
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return busses;
		
	}

	@Override
	public List<Human> getAllById(long id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
