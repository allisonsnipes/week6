/*
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Assignment 6 Question 1
 * 
 * Project Specs:
 * Write a program that models an employee. It should have an employee number, a name, an address, 
 * and a hire date. To keep things simple, your classes don’t need to do any editing of data. You may
 * use the Date class from the lectures or define your own. The Java-supplied Date class cannot be used.   
 * 
 * name: first name and a last name. 
 * address: street, a city, a state (2 characters), and a 5-digit zipcode. 
 * date: an integer month, day and year. The Date fields should be reasonably valid values 
 * 		(ex. month 1-12, day 1-31, year > 1900 and < 2020). 
 * 
 * Project Deliverables:
 * 
 * 1. Create an Employee, a first/last name, an address, and a date classes in your solution.
 * 
 * 2. Provide appropriate class constructors, getter methods, setter methods, toString() and any 
 *    other methods you think are necessary. 
 *    
 * 3. The classes should not do any direct user input/output. All user input/output will be done in 
 *    the main method.
 *    
 * 4. Your program should prompt the user to enter data for several employees, store the data in an array
 *    of type Employee, and then display the data.
 */

import java.util.Scanner;

public class Employee {
	/*
	 * Here I will declare my global variables for the application and/or needed items for the constructors.
	 */
	private String firstName, lastName, address;
	private int id, zipCode;
	private Date hiredDate;

	public static void main(String[] args) {
		headerMsg();
		
		System.out.println("\nLet's begin by entering the employees names: ");
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		/*
		 * Put the getters/setters methods here for id, firstName, lastName, dateHired
		 */
		
		
		/*
		 * Put the toString() method here put the getter/setter methods for address here(?)
		 * based on OH notes.
		 */
		
	}
	
	/*
	 * Setting up the default constructor for the employee demographic information. This is what is supposed
	 * to populate if the user doesn't input anything when prompted.
	 */
	public EmployeeDemographc() {
		id = 0123;
		firstName = "Sailor";
		lastName = "Moon";
		address = "123 Anime Street, Moon City, CA, 94118";
		hiredDate = new Date(03, 21, 1990);
	}

	/*
	 * Using reading as a reference to properly use a date constructor using containment
	 */
	public class Date{
		
	}

	private static void headerMsg() {
		System.out.println("\n");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                                   Welcome User,                              |");
		System.out.println("|         This application will display a list of employees based on the       |");
		System.out.println("|    the information you will provide. Please enter some basic demographic     |");
		System.out.println("|      information of several indivduals in order to use this application.     |");
		System.out.println("|   You may start first by entering the employees: first names, last names,    |");
		System.out.println("|        addresses, and the dates they were hired. Do make sure that the       |");
		System.out.println("|       information that you enter is entered correctly! Let's start!          |");
		System.out.println("+------------------------------------------------------------------------------+");
	}
	
	
}
