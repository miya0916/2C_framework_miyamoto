package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class gitLLoginController {
	//画面表示用
		@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
		public String viewPage() {

			return "gitlogin";
		}

		//ログイン検証用
		@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
		public String loginPost(String id, String pw, HttpSession session) {
			
			session.setAttribute("id", id);       
			session.setAttribute("pw", pw);
			
			if(("gitlogin".equals(id)) && ("gitpw".equals(pw))) {
				return "redirect:/gititemlist";
			}else {
				return "gitlogin";
			}

			
		}
}
