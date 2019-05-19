package com.sellnbye.user;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	private UserService servise;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<register> listregister = servise.listAll();
		model.addAttribute("listregister",listregister);
		
		return "index";
		
	}
	

}
