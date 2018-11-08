package com.PoliticalReddit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String LoginPage() {
		return "index.jsp";
	}

}
