package com.care.root.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieCintroller {
	@RequestMapping("cookie")
	public String myCookie(HttpServletResponse response,
							@CookieValue(value = "myCookie" , required = false) Cookie cookie) {//required = false : 사용자로 부터 요청이 들어왔을 때 마이쿠키 값이 없다면 null값으로 처리하겠다 
		System.out.println(cookie);
		Cookie cook = new Cookie("myCookie", "쿠키생성");//쿠키생성
		cook.setMaxAge(10);//쿠키시간
		response.addCookie(cook);
		return "cookie/cookie";
	}
}
