package com.zkp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zkp.domain.Student;
import com.zkp.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService ss;
	
	@RequestMapping("list")
	public String list(Model m,Student stu) {
		List<Student> list = ss.getlist(stu);
		m.addAttribute("list",list);
		return "list";
	}
	
	
	
	
	
	//创建maven项目 然后搭建配置 依次 实体类 dao层，service层 controller层
	//最后在list页面调出数据
}
