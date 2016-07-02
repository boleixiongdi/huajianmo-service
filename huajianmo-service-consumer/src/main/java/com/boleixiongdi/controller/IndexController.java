package com.boleixiongdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.demo.consumer.DemoAction;

/**
* @author : bolei
* @date : Feb 10, 2016
* 类说明
*/

@Controller
public class IndexController {

	@Autowired
	private DemoAction demoAction;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index()
	{
		try {
			demoAction.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String admin()
	{
		return "/index";
	}
}
