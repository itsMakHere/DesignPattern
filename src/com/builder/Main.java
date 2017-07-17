package com.builder;

public class Main {

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails.Builder("Khan","Ahmed",212614077).build();
		e.print();
		
		System.out.println("Saving State.....\n--------------------------------");
		e.SaveEmployeeDetails();
		System.out.println("State Saved Succesfully.....\n--------------------------------");
		
		
		e = new EmployeeDetails.Builder("Test","Auto",212548740).email("b@mail.com").alternateEmail("c@mail.com").build();
		System.out.println("State Before Restore.....\n--------------------------------");
		e.print();
		
		System.out.println("State After Restore.....\n--------------------------------");
		e = e.restoreEmployeeDetails();
		e.print();
		
		
	}

}
