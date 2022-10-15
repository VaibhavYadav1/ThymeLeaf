package com.bharath.springweb.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharath.springweb.thymeleaf.model.Student;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/senddata")
	public ModelAndView sendData() {
		ModelAndView mav = new ModelAndView("data");
		mav.addObject("message", "Take up one idea and change your life");
		mav.addObject("creator", "Bharath");
		return mav;
	}
	
	@RequestMapping("/student")
	public ModelAndView getstudent() {
		ModelAndView mav = new ModelAndView("student");
		Student student = new Student();
		student.setName("Vaibhav Yadav");
		student.setScore(100);
		student.setTotal_marks(100);
		student.setRemark("good");
		
		mav.addObject("students", student);
		return mav;
	}
	
	@RequestMapping("/students")
	public ModelAndView getstudents() {
		ModelAndView mav = new ModelAndView("studentList");
		Student student1 = new Student();
		student1.setName("john");
		student1.setScore(10);
		student1.setTotal_marks(100);
		student1.setRemark("poor");
		
		Student student2 = new Student();
		student2.setName("don");
		student2.setScore(5);
		student2.setTotal_marks(100);
		student2.setRemark("poor");
		
		List<Student> student = Arrays.asList(student1,student2);
		
		mav.addObject("students", student);
		return mav;
	}
	
	@RequestMapping("/studentForm")
	public ModelAndView displayStudentform() {
		ModelAndView mav = new ModelAndView("studentform");
		Student student = new Student();
		student.setName("Vaibhav Yadav");
		student.setScore(100);
		student.setTotal_marks(100);
		student.setRemark("good");
		mav.addObject("student", student);
		return mav;
	}
	
	@RequestMapping("/savestudent")
	public ModelAndView savesStudent(@ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView("result");
		System.out.println(student.getName());
		System.out.println(student.getScore());
		System.out.println(student.getTotal_marks());
		System.out.println(student.getRemark());
		return mav;
	}	
}