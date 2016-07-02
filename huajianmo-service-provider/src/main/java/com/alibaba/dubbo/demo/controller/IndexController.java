package com.alibaba.dubbo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* @author : bolei
* @date : Feb 10, 2016
* 类说明
*/

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index()
	{
		return "/index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String admin()
	{
		return "/index";
	}
}
