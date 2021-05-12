package com.care.root.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieCintroller {
	@RequestMapping("cooike")
	public String myCookie() {
		return "cookie/cookie";
	}
}
