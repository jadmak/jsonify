package com.jadmak.jsonify.jackson;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Person {

	String firstName;
	String lastName;
	Gender gender;
	List<String> hobbies;
	int socialSecurityNumber;
	String[] accessCodes;

	@JsonGetter("FirstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonSetter("FirstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonGetter("LastName")
	public String getLastName() {
		return lastName;
	}

	@JsonSetter("LastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonGetter("Gender")
	public Gender getGender() {
		return gender;
	}

	@JsonSetter("Gender")
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@JsonGetter("Hobbies")
	public List<String> getHobbies() {
		return hobbies;
	}

	@JsonSetter("Hobbies")
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@JsonGetter("SocialNumber")
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@JsonSetter("SocialNumber")
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@JsonGetter("AccessCodes")
	public String[] getAccessCodes() {
		return accessCodes;
	}

	@JsonSetter("AccessCodes")
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
