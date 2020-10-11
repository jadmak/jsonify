package com.jadmak.jsonify;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

 

public class MainClass {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mp = new ObjectMapper();
		Gson gson = new Gson();		
		
		
		 //Concert to JSON in Jackson, read using GSON
		com.jadmak.jsonify.jackson.Person person  = new  com.jadmak.jsonify.jackson.Person();
		 
		person.setFirstName("Jad");
		person.setLastName("Makarem");
		person.setGender(com.jadmak.jsonify.jackson.Gender.Male);
		person.setHobbies(Arrays.asList("hiking", "photography", "technology"));
		person.setSocialSecurityNumber(79232323);
		person.setAccessCodes(new String[] { "DDD", "VVVV" });
		
		

		String personJSON = mp.writeValueAsString(person);
		System.out.printf("JSON Person :\n%s\n\n", personJSON);
		
		com.jadmak.jsonify.gson.Person personR = gson.fromJson(personJSON, com.jadmak.jsonify.gson.Person.class);
		System.out.printf("Person Recreaded :\n%s\n\n", personR);
	}

}
