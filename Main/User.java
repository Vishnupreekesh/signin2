package Main;

import java.util.Map;
import java.util.*;

public class User {
	String firstname;
	String lastname;
	String password;
	int status;
	int emailType;
	String email;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}



	public int getEmailType() {
		return emailType;
	}
	
	public void setEmailType(int emailType) {
		this.emailType = emailType;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}






	
	@Override
	public String toString() {
		return email+" "+password;
	}

	
}
