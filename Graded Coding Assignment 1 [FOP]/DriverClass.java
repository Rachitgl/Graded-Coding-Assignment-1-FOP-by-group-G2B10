package com.greatlearning.main;

import com.greatlearning.service.TechDepartment;
import com.greatlearning.service.AdminDepartment;
import com.greatlearning.service.HRDepartment;

//Driver Class
public class DriverClass {
	public static void main(String[] args) {
		HRDepartment hrdept = new HRDepartment();
		AdminDepartment admindept = new AdminDepartment();
		TechDepartment techdept = new TechDepartment();
		
		System.out.println("Welcome to " + admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
		System.out.println();
	}
}