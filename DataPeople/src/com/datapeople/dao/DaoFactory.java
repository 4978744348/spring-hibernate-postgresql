package com.datapeople.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoFactory {
	
	private static final ApplicationContext CONTEXT = new ClassPathXmlApplicationContext("spring.xml");
	
	public static HumanDao getHumanDao(){
		return (HumanDao) CONTEXT.getBean("humanDao");
	}
	
	public static ApplicationContext getContext(){
		return CONTEXT;
	}

}
