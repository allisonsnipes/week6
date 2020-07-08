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

/*
 * Here I will:
 * 1. Declare my global variables and various classes for the application and/or needed items for the constructors.
 * 2. Make all of my getter and setter methods for my classes under each respective class
 * 3. Put the toString() method here put the getter/setter methods for address here based on OH notes for ther date.
 * 4. The Employee default constructor is parameterized in preparation of receiving the employees' demographic information. 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public String getEmpStreet() {
		return street;
	}
	
	public void setEmpStreet(String street) {
		this.street = street;
	}
	
	public String getEmpCity() {
		return city;
	}
	
	public void setEmpCity(String city) {
		this.city = city;
	}
	
	public String getEmpState() {
		return state;
	}
	
	public void setEmpState(String state) {
		this.state = state;
	}
	
	public String getEmpZip() {
		return zipCode;
	}
	
	public void setEmpZip(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Address (String street, String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String toString() {
		return  street + "," + city + "," + state + " " + zipCode;
	}
	
}

class Names {
	private String firstName, lastName;
	
	public String getEmpFirst() {
		return firstName;
	}
	
	public void setEmpFirst(String firstName) {
		this.firstName = firstName;
	}
	
	public String getEmpLast() {
		return lastName;
	}
	
	public void setEmpLast(String lastName) {
		this.lastName = lastName;
	}
	
	public Names (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
	
/*
 * Using reading as a reference to properly use a date constructor using containment
*/
class Date {
	private int day, month, year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.day = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.day = year;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	

	public String toString() {
		return  day + " " + month + " " + year;
	}
	
}

class EmployeeData {
	private int id;
	private Names name;
	private Address residence;
	private Date hired;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Names getNames() {
		return name;
	}
	
	public void setNames (Names name) {
		this.name = name;
	}
	
	public Address getPlace() {
		return residence;
	}
	
	public void setPlace(Address residence) {
		this.residence = residence;
	}
	
	public Date getHired() {
		return hired;
	}
	
	public void setHired(Date hired) {
		this.hired = hired;
	}
	
	EmployeeData (int id, Names name, Address residence, Date hired) {
		setId(id);
		setNames(name);
		setPlace(residence);
		setHired(hired);
	}
	
	public void showIt() {
		System.out.println("Employee Id: " + id);
		System.out.println("Name: " + name.toString());
		System.out.println("Address: " + residence.toString());
		System.out.println("Hired date: " + hired.toString());
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}

public class Employee {
	public static void main(String[] args) {

		headerMsg();
	
		System.out.println("\nLet's begin by entering the number of employees that you want to enter: ");
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();
		ArrayList<EmployeeData> informationGathered = new ArrayList<EmployeeData>();
		
		while(true) {
			
			//get the name and id	
			System.out.println("Enter the employee's id: \n");
			int id = input.nextInt();
			if  (id <= 0) {
				System.out.print("Please enter a number greater than 0");
				break;
			}
			
			System.out.println("Enter the employee's first name: \n");
			String firstName = input.nextLine();
			
			System.out.println("Enter the employee's last name: \n");
			String lastName = input.nextLine();
			
			Names name = new Names(firstName, lastName);
			
			System.out.println("Enter the employee's street residence: \n");
			String street = input.nextLine();
			
			System.out.println("Enter the employee's city residence: \n");
			String city = input.nextLine();
			
			System.out.println("Enter the employee's state of residence: \n");
			String state = input.nextLine();
			if  (state.length() != 2) {
				System.out.print("Please enter a two letter state.");
				break;
			}
			
			System.out.println("Enter the employee's zipcode: \n");
			String zipCode = input.nextLine();
			if  (zipCode.length() != 5) {
				System.out.print("Please enter a proper zipcode.\n");
				break;
				
			}
			
			Address residence = new Address (street, city, state, zipCode);
			
			//get the hire date
			int day = 0;
			int month = 0;
			int year = 0;
			
			while (day <=0 || day > 31) {
				System.out.println("Please enter a proper numerical calendar date.\n");
				break;
			}
			
			while (month <=0 || month > 12) {
				System.out.println("Please enter a proper numerical calendar month.\n");
				break;
			}
			
			while (year > 1900 || year < 2020) {
				System.out.println("Please enter a proper year in which the employee was hired.\n");
				break;
			}
			
			Date hiredInfo = new Date(day, month, year);
			
			//put all the information together to create an object
			EmployeeData person = new EmployeeData(id, name, residence, hiredInfo);  
			
			//set up the actual array
			informationGathered.add(person);
			System.out.println();
			
			//display all of the array items
			for (EmployeeData e: informationGathered) {
				e.display();
				System.out.println("");
			}
			
			
		}
			
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
