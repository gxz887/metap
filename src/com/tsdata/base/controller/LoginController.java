package com.tsdata.base.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sogou.hibernate.EqCondition;
import com.sogou.hibernate.ICondition;
import com.tsdata.base.entity.UserExt;
import com.tsdata.base.service.IUserServiceExt;

@Controller
@Scope("request")
public class LoginController {
	@Resource(name = "userService")
	private IUserServiceExt userService;
	
	private final static Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login")
	public String login(@RequestParam("loginName") String loginName, @RequestParam("password") String password,  HttpSession session, HttpServletRequest request, ModelMap map){
		//�ж���֤��
		//if(yzm==null||yzm.isEmpty()||!yzm.equals(session.getAttribute("rand"))){
		//	return "/login";@RequestParam("yanzhengma") String yzm,
		//}
		
		if(loginName!=null&&!loginName.isEmpty()){
			List<ICondition> conditions = new ArrayList<ICondition>();
			conditions.add(new EqCondition("name",loginName));
			List<UserExt> userList = userService.criteriaQuery(conditions);
			if(userList.size()==1 && userList.get(0).getpassword()!=null){
				UserExt userExt = userList.get(0);
				if(userExt.getpassword().equals(password)){
					map.addAttribute("error", "用户名不存在或者密码错误");
					session.setAttribute("user", userExt);
					return "/login";
				}else{
					map.addAttribute("error", "用户名不存在或者密码错误");
				}
			}else{
				map.addAttribute("error", "用户名不存在或者密码错误");
			}
		}else{
			map.addAttribute("error", "用户名不存在或者密码错误");
		}
		return "/login";
	}
}
