package com.osf.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class URIController {

	@RequestMapping(value="/uri/**", method=RequestMethod.GET)
	//*가 하나있을때는 딱 한폴더까지 .. **를 해야지 기존서블릿처럼 폴더 몇개를 사용하든지 상관없이 된다 .
	public String goPage(HttpServletRequest request) {
		return request.getRequestURI();
	}
	
//	@RequestMapping(value="/uri/**", method=RequestMethod.GET)
//	//*가 하나있을때는 딱 한폴더까지 .. **를 해야지 기존서블릿처럼 폴더 몇개를 사용하든지 상관없이 된다 .
//	public String goPage(HttpServletRequest request) {
//		String uri = request.getRequestURI();
//		uri = uri.replace("/uri", "");
//		return uri;
////		return request.getRequestURI();
//	}
}
