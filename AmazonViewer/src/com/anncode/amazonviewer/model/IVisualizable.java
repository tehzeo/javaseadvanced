package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * This method captures the starting time when watching!
	 * 
	 * @param dateI Is an object {@code Date} with the exact time.
	 * @return returns captured date.
	 * */
	Date startToSee(Date dateI);
	
	
	/**
	 * This method captures the exact time from start to end of the watched element.
	 * 
	 * @param dateI Its an object {@code Date} with the exact time.
	 * @param dateF Its an object {@code Date} with the exact time.
	 * */
	void stopToSee(Date dateI, Date dateF);
	
}
