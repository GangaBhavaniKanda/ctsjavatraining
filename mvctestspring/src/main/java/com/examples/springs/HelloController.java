package com.examples.springs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	private String mesg="hi welcome to springmvc";
	@RequestMapping("/hi")
	public String showMessage(Model model) {
		model.addAttribute("message", mesg);
		return "test";
	}

}
