package com.datapeople.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.datapeople.bean.Human;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.DaoFactory;
import com.datapeople.dao.HibFactory;

@Controller
public class HumanRenderingController {
	
	@RequestMapping("/HumanList.spr")
	public ModelAndView getAllHumans() throws DaoException{
		List<Human> list = DaoFactory.getHumanDao().getAll();
		return new ModelAndView("listHumans","listOfHumans",list);
	}
	
	@RequestMapping("/HibHumanList.spr")
	public ModelAndView getAllHibHumans() throws DaoException{
		List<Human> list = HibFactory.getInstance().getHumanDao().getAll();
		return new ModelAndView("listHumansHib","listOfHumans",list);
	}

}
