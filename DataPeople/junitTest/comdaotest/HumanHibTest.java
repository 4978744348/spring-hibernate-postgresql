package comdaotest;

import org.junit.Test;

import com.datapeople.dao.DaoException;
import com.datapeople.dao.DaoFactory;
import com.datapeople.dao.HibFactory;
import com.datapeople.dao.db.HibernateCongigurator;
import com.datapeople.dao.db.HumanDaoImplHibernate;

public class HumanHibTest {
	
	@Test
	public void getAll() throws DaoException{
		
		System.out.println(HibFactory.getInstance().getHumanDao().getAll());
		
	}

}
