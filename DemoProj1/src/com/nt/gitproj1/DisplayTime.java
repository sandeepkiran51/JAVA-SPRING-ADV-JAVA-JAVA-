package com.nt.gitproj1;

import java.util.Date;

public class DisplayTime {
	@SuppressWarnings("deprecation")
	public void display() {
		Date d = null;
		int hour = 0;
		int min = 0;
		int sec = 0;
		int date = 0;
		
		
		
		d = new Date();
		hour = d.getHours();
		min = d.getMinutes();
		sec = d.getSeconds();
		date = d.getDate();
		
		System.out.println("date : "+date+" hour : "+hour+" min : "+min+" sce "+sec );
	}

}
