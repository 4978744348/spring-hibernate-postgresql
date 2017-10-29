package com.datapeople.controllerServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datapeople.bean.Human;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.HibFactory;

@WebServlet("/HumanServlet.do")
public class HumanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HumanServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Human> list = HibFactory.getInstance().getHumanDao().getAll();
			request.setAttribute("listHumansHib", list);
			request.getRequestDispatcher("listHumServ.jsp").forward(request, response);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
