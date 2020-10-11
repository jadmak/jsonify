package com.jsonify.majordiff;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class PhoneBookEntry {
	String number;
	String firstName;
	String lastName;
	String email;
	int somefield = 0;

	public PhoneBookEntry() {

	}

	public PhoneBookEntry(String number, String firstName, String lastName, String email) {
		super();
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFirstName() {
		if (Character.isLowerCase(firstName.charAt(0))) {
			return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		}
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {

		if (Character.isLowerCase(lastName.charAt(0))) {
			return lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		}
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mp = new ObjectMapper();
		Gson gson = new Gson();

		PhoneBookEntry entry = new PhoneBookEntry("345345", "jad", "makarem", "me@jadmak.com");

		String jacksonJSON = mp.writeValueAsString(entry);
		System.out.printf("Jackson JSON :\n%s\n\n", jacksonJSON);

		String gsonJSON = gson.toJson(entry);
		System.out.printf("GSON JSON :\n%s\n\n", gsonJSON);

	}

}
