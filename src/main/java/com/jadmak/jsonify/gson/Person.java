package com.jadmak.jsonify.gson;

import java.util.Arrays;
import java.util.List;

import com.google.gson.annotations.SerializedName;

 

public class Person {

	@SerializedName("FirstName")
	String firstName;
	@SerializedName("LastName")
	String lastName;
	@SerializedName("Gender")
	Gender gender;
	@SerializedName("Hobbies")
	List<String> hobbies;
	@SerializedName("SocialNumber")
	int socialSecurityNumber;
	@SerializedName("AccessCodes")
	String[] accessCodes;

 
	public String getFirstName() {
		return firstName;
	}

 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

 
	public String getLastName() {
		return lastName;
	}

 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

 
	public Gender getGender() {
		return gender;
	}

 
	public void setGender(Gender gender) {
		this.gender = gender;
	}

 
	public List<String> getHobbies() {
		return hobbies;
	}

 
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

 
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

 
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

 
	public String[] getAccessCodes() {
		return accessCodes;
	}

 
	public void setAccessCodes(String[] accessCodes) {
		this.accessCodes = accessCodes;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", hobbies="
				+ hobbies + ", socialSecurityNumber=" + socialSecurityNumber + ", accessCodes="
				+ Arrays.toString(accessCodes) + "]";
	}

}
