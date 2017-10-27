package comdaotest;

import org.junit.Test;

import com.datapeople.dao.DaoException;
import com.datapeople.dao.DaoFactory;

public class HumanGetAll {
	
	@Test
	public void getAllHuman() throws DaoException{
		System.out.println(DaoFactory.getHumanDao().getAll());
	}

}
