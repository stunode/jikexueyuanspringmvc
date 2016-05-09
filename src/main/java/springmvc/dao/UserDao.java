package springmvc.dao;

import springmvc.bean.User;
import org.springframework.stereotype.Repository;



@Repository
public class UserDao {

	public User selectByUsername(String username) {
		
		// admin
		if ("admin".equals(username)) {
			User user = new User();
			user.setPassword("123");
			user.setUsername("admin");
			return user;
		}
		
		return null;
	}

}
