package com.datapeople.dao.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCongigurator {

	private static HibernateCongigurator instance;
	private SessionFactory sesionFactory;

	public static HibernateCongigurator getInstance() {
		if (instance == null) {
			synchronized (HibernateCongigurator.class) {
				if (instance == null) {
					instance = new HibernateCongigurator();
				}
			}
		}
		return instance;
	}
	
	private HibernateCongigurator() {
		sesionFactory = new Configuration().configure().buildSessionFactory();
	}

	public SessionFactory getConfiguration() {
		return sesionFactory;
	}

}
