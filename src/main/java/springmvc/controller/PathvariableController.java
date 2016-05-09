package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.bean.User;

@Controller
public class PathvariableController {

	@ResponseBody
	@RequestMapping("/pathvariable/{username}")
	public User test1(@PathVariable String username){
		User user = new User() ;
		user.setUsername(username);
		return user;
	}

	@ResponseBody
	@RequestMapping("/pathvariable2/{intval}")
	public User test1(@PathVariable Integer intval){
		User user = new User() ;
		user.setUsername(intval + "");
		return user;
	}
	
}
