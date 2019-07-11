package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Student;
import com.bw.service.StudentService;

@Controller
public class HelloController {
	
	@Autowired
	StudentService studentService;
	
	@ResponseBody
	@RequestMapping("get")
	public String get() {
		
		return "success";
	}

	
	@ResponseBody
	@RequestMapping("students")
	public List<Student> students(){
		
		List<Student> students = studentService.getStudents();
		return students;
		
	}
	
	
	@RequestMapping("list")
	public String list(Model model){
		
		List<Student> students = studentService.getStudents();
		model.addAttribute("students", students);
		return "list";
		
	}
}
