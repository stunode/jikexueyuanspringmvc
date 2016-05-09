package springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import springmvc.bean.User;
import springmvc.service.UserService;

@Controller
@SessionAttributes("user")
public class UserController {

	@Resource
	UserService service;
	@RequestMapping("login")
	public String toLoginPage(){
		return "/WEB-INF/jsp/login.jsp";
	}
	
	@RequestMapping(value = "doLogin", method = RequestMethod.POST)
	public String doLogin(@RequestParam String username , @RequestParam String password, HttpServletRequest request, ModelMap map ){

		try {
			User user = service.doLogin(username, password);
			map.put("user", user);
		} catch (Exception e) {
			request.setAttribute("error", e.getMessage());
			return "/WEB-INF/jsp/login.jsp";
		}

		return "/WEB-INF/jsp/loginsuccess.jsp";
	}
	
	@RequestMapping("doLogout")
	public String doLogout(SessionStatus status){
		status.setComplete();
		return "/WEB-INF/jsp/login.jsp";
	}
	
}
