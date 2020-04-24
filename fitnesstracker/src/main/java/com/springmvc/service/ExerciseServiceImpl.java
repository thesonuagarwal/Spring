package com.springmvc.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	
	@Override
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
	Activity bike = new Activity();
		run.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		run.setDesc("Swim");
		activities.add(swim);
		
		List<String> activities1 = new ArrayList<String>();
		activities1.add("A");
		activities1.add("B");
		activities1.add("C");
		
		
		return activities;
	}
}
