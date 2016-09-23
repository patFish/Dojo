package agile.userLogin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UserLoginTest {

	@Test
	public void UserTest() throws Exception {

		User user = new User();
		String userId = "1234567890";
		String userEmail = "pfischer@acn.ch";
		String userNickName = "patsie";

		assertNotNull(user.getRegistryDate());

		user.setId(userId);
		assertEquals(userId, user.getId());

		user.setEmail(userEmail);
		assertEquals(userEmail, user.getEmail());

		user.setNickName(userNickName);
		assertEquals(userNickName, user.getNickName());
	}

	@Test
	public void testRegistrationInterface() throws Exception {

		IRegistrationImpl registery = new IRegistrationImpl();

	}

}
