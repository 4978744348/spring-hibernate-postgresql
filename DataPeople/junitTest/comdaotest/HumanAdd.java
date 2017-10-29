package comdaotest;

import java.util.Date;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.datapeople.bean.Address;
import com.datapeople.bean.Human;
import com.datapeople.bean.Street;
import com.datapeople.dao.DaoException;
import com.datapeople.dao.DaoFactory;
import com.datapeople.dao.HibFactory;

public class HumanAdd {
	
	private static Human human;
	private static Address address;
	private static Street street;
	
	@BeforeClass
	public static void init(){
		street = new Street();
		
		human = new Human();
		address = new Address();
		address.getId();
		street.getId();
		human.setLastName("newtest");
		human.setFirstName("newtest");
		human.setMiddleName("newtest");
		human.setSex("m");
		human.setBirthDate(new Date(human.getBirthDate().getTime()));
		human.setAdress(address);
		address.setStreet(street);
		address.setHouseNumber(120);
		street.setNameStr("derjinskogo");
		
	}
	
	@Test
	public void getAllHuman() throws DaoException{
		HibFactory.getInstance().getHumanDao().addHuman(human,address,street);
		Assert.assertNotNull(human);
		Assert.assertNotNull(address);
		Assert.assertNotNull(street);
	}

}
