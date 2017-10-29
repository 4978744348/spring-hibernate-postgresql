package com.datapeople.dao.db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.datapeople.bean.Address;
import com.datapeople.bean.Human;
import com.datapeople.bean.Street;
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

public class HumanDaoImplHibernate implements HumanDao {


	@Override
	public List<Human> getAll() throws DaoException {

		Session session = null;
		Transaction transaction = null;
		List<Human> list = new ArrayList<Human>();
		try {
			session = HibernateCongigurator.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			list = session.createCriteria(Human.class).list();
			transaction.commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "err: 'getAll'", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return list;

	}

	@Override
	public void addHuman(Human human,Address address,Street street) throws DaoException {
		Session session = null;
		Transaction transaction = null;
		try {

			session = HibernateCongigurator.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(human);
			session.save(address);
			session.save(street);
			transaction.commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "err: 'addHuman'", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

	}

}
