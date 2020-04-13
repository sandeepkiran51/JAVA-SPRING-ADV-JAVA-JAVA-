package com.nt.gitproj1;

import java.util.Date;

public class DisplayTime {
	@SuppressWarnings("deprecation")
	public void display(String name) {
		Date d = null;
		int hour = 0;
		int min = 0;
		int sec = 0;
		int date = 0;
		int year = 0;
		int month = 0;
		

		d = new Date();
		date = d.getDate();
		month = d.getMonth();
		year = 1900 + d.getYear();

		hour = d.getHours();
		min = d.getMinutes();
		sec = d.getSeconds();
		date = d.getDate();
		System.out.println("Today's Date and time is....");
		System.out.println("date : " + date + "-" + month + "-" + year + "\ntime is " + hour + " : " + min
				+ " : " + sec);
		new DisplayTime().wishMsg(hour, name);
		;
	}

	public void userName(String name) {
		System.out.println("Hello " + name);
		new DisplayTime().display(name);
	}

	public void wishMsg(int hour, String name) {
		// plz provide implementation
		if(hour>9&&hour<12)
			System.out.println("Good Morning....."+name);
		else if(hour>12&&hour<16)
			System.out.println("Good Afternoon..."+name);
		else if(hour>17&& hour<20)
			System.out.println("Good Evening....."+name);
		else
			System.out.println("Good Night......"+name);

		
		
		try {
			
		}
		finally {
			System.out.println("thank you & visti again...");
		}

	}

}
