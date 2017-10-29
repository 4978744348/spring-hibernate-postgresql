package com.datapeople.dao;

import com.datapeople.dao.db.HumanDaoImplHibernate;

public class HibFactory {
	
	private static HibFactory instance;
	private static HumanDao humanDao;
	
	public static synchronized HibFactory getInstance(){
	    if (instance == null){
	      instance = new HibFactory();
	    }
	    return instance;
	  }
	
	public HumanDao getHumanDao(){
		if(humanDao == null){
			humanDao = new HumanDaoImplHibernate();
		}
		
		return humanDao;
	}

}
