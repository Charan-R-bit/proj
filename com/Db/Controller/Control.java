package com.Db.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Db.Entity.Entity;
import com.Db.Service.Servic;


@Controller
@RequestMapping("/control")
public class Control 
{
	@Autowired
	Servic service;
	@GetMapping("/get")
	@ResponseBody
	public Entity  get()
	{
		return service.getEmp();
//		return service.getEmp();
	}
	@GetMapping
	public Entity getid()
	{
		return null;
		
	}
	@GetMapping("/getcartbyid/{cartdId}")
	public Entity getCartById(int cartdId) 
	{
		return get() ;
	}
}
