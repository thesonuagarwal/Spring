package com.springmvc.model;

import org.hibernate.validator.constraints.Range;

public class Goal {
	
	@Range(min=1,max=120)
	private int minutes;

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
