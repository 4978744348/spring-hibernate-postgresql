package com.datapeople.dao.db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.datapeople.bean.Human;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.HumanDao;



public class HumanDaoImplHibernate implements HumanDao{
	
	private SessionFactory sesionFactory;
	
	public void setSesionFactory(SessionFactory sesionFactory) {
		this.sesionFactory = sesionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Human> getAll() throws DaoException {
		try{
		Session session = this.sesionFactory.getCurrentSession();// here come is null!
		List<Human> personsList = session.createQuery("from Human").list();
		return personsList;
		}catch(NullPointerException e){
			System.out.println("cause: "+e.getCause());
		}
		return null;
		
			
		
		
		
	}

	@Override
	public List<Human> getAllById(long id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
