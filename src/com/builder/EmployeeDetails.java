package com.builder;

public class EmployeeDetails {
	
	private static EmployeeDetails employeeState;
	private String firstName;
	private String lastName;
	private int SSO;
	private String email;
	private String alternateEmail;
	
	public static class Builder{
		private String firstName;
		private String lastName;
		private int SSO;

		//optional parameter
		private String email = null;
		private String alternateEmail = null;
		
		Builder(String firstName, String lastName, int SSO){
			this.firstName = firstName;
			this.lastName = lastName;
			this.SSO = SSO;
		}
		
		public Builder email(String val){
			this.email = val;
			return this;
		}
		
		public Builder alternateEmail(String val){
			this.alternateEmail = val;
			return this;
		}
		
		public EmployeeDetails build(){
			return new EmployeeDetails(this);
			
		}
		
	}
	
	
	public EmployeeDetails(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.SSO = builder.SSO;
		this.email = builder.email;
		this.alternateEmail = builder.alternateEmail;
	}
	
	public void SaveEmployeeDetails(){
		employeeState = this;
		
	}
	
	public EmployeeDetails restoreEmployeeDetails(){
		return employeeState;
	}
	
	public void print(){
		System.out.println("First Name :- " +firstName+" ");
		System.out.println("Last Name :- " +lastName+" ");
		System.out.println("SSO :- " +SSO+" ");
		System.out.println("Email :- " +email+" ");
		System.out.println("AlternateEmail :- " +alternateEmail+"\n------------------------------------------------");
	}

}
