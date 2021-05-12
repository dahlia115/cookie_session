package com.care.root.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {
	@GetMapping("makeSession")
	public String makeSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("id", "a123");
		session.setAttribute("name", "김철수");
		session.setAttribute("addr", "서울");
		return "session/makeSession";
	}
	@GetMapping("resultSession")
	public String resultSession() {
		return "session/resultSession";
	}
	@GetMapping("delSession")
	public String delSession(HttpSession session) {
		session.invalidate();//세션삭제
		return "session/delSession";
	}
}
	









