package comdaotest;

import org.junit.Test;

import com.datapeople.dao.DaoException;
import com.datapeople.dao.DaoFactory;
import com.datapeople.dao.db.HibernateCongigurator;
import com.datapeople.dao.db.HumanDaoImplHibernate;

public class HumanHibTest {
	
	@Test
	public void getAll() throws DaoException{
		HumanDaoImplHibernate hib = new HumanDaoImplHibernate();
		hib.getAll();
		System.out.println(hib);
		
	}

}
