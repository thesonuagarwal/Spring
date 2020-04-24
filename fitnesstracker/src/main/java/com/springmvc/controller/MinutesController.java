package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.Activity;
import com.springmvc.model.Exercise;
import com.springmvc.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes( @ModelAttribute ("exercise") Exercise exercise){
		System.out.println("exercise: " + exercise.getMinutes());
		return "addMinutes";
		//return "forward:addMoreMinutes.html";
		//return "redirect:addMoreMinutes.html";
	}
	

	@RequestMapping(value="/activities")
	public String findAllActivities(Model model){
		model.addAttribute("activities", exerciseService.findAllActivities());
		System.out.println(exerciseService.findAllActivities());
		return "hello";
	}
	
	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes( @ModelAttribute ("exercise") Exercise exercise){
		System.out.println("exercising: " + exercise.getMinutes());
		return "addMinutes";
	}

}
