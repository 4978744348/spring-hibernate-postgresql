package comdaotest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.datapeople.bean.Human;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.DaoFactory;

public class HUmanGetById {
	
	private static Human human;
	
	@BeforeClass
	public static void init(){
		human = new Human();
		human.setId(1);
	}
	
	@Test
	public void getAllHuman() throws DaoException{
		System.out.println(DaoFactory.getHumanDao().getAllById(human.getId()));
	}

}
