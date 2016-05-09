package springmvc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import springmvc.bean.User;
import springmvc.dao.UserDao;

@Service
public class UserService {

	@Resource
	UserDao dao ;

	public User doLogin(String username, String password) throws Exception {
		
		if (username == null || "".equals(username)) {
			throw new Exception("�û�������Ϊ��");
		}
		if (password == null || "".equals(password)) {
			throw new Exception("���벻��Ϊ��");
		}		
		
		User user = dao.selectByUsername(username);
		if (user == null) {
			throw new Exception("�û���������");
		}
		
		if (!user.getPassword().equals(password)) {
			throw new Exception("�������");
		}
		
		return user ;
		
	}
	
}
