package in.sp.beans;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student
{
	//@Size(min=3, max = 15, message = "Name is not valid")
	@Pattern(regexp = "^[a-zA-Z]{3,15}", message = "Name is not valid")
	private String name;
	
	@Pattern(regexp = "^[a-zA-Z0-9_.]+@[a-z]+.[a-z]{2,4}+$", message = "Email id is not valid")
	private String email;
	
	@Pattern(regexp = "^[a-zA-Z0-9@#$]{5,10}", message = "Password is not valid")
	private String password;
	
	@NotEmpty(message = "Please Select Gender")
	private String gender;
	
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
