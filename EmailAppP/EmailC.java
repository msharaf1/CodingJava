package EmailAppP;
import java.util.*;
/*
 Generate an email with the following syntax: firstname.lastname@department.company.com
 Determine the department (sales, development, accounting), if none leave blank
 Generate a random String for a password
 Have set methods to change the password, set the mailbox capacity, and define an alternate
email address
 Have get methods to display the name, email, and mailbox capacit
 */

public class EmailC {
	private String firstName;
	private String lastName;
	private String department;
	private String company;
	private String password;
	private String email;
	
	public EmailC() {};//Constructor
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getDepartment() {
		return this.department;
	}
	
	public String getCompany() {
		return this.company;
	}
	public String getPassword() {
		return this.password;
	}
	
	public void setEmail(String email) {
		char fChar = email.charAt(0);
		String fLetter = Character.toString(fChar);
		
		email = fLetter + "." +getLastName().toLowerCase() + "@" + getDepartment().toLowerCase() +"."  + getCompany().toLowerCase() + ".com";
		
		this.email = email;
//		System.out.print(email);
	}
	
	public String getEmail() {

		return email;
	}
	

}//class
