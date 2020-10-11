package com.jadmak.jsonify.gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainClass {

	public static void main(String[] args)   {

		Person per1 = new Person();
		per1.setFirstName("Jad");
		per1.setLastName("Makarem");
		per1.setGender(Gender.Male);
		per1.setHobbies(Arrays.asList("hiking", "photography", "technology"));
		per1.setSocialSecurityNumber(79232323);
		per1.setAccessCodes(new String[] { "DDD", "VVVV" });

		Person per2 = new Person();
		per2.setFirstName("May");
		per2.setLastName("June");
		per2.setGender(Gender.Female);
		per2.setHobbies(Arrays.asList("travel", "food", "blogging"));
		per2.setSocialSecurityNumber(54453453);
		per2.setAccessCodes(new String[] { "AAA", "CCC" });

		List<Person> pers = new ArrayList<Person>();
		pers.add(per1);
		pers.add(per2);

		Person[] persArr = new Person[] { per1, per2 };

		// Map to JSON and print
		Gson gson = new Gson();

		String jsonPer1 = gson.toJson(per1);
		System.out.printf("JSON Person 1:\n%s\n\n", jsonPer1);

		String jsonPer2 = gson.toJson(per2);
		System.out.printf("JSON Person 2:\n%s\n\n", jsonPer2);

		String jsonPerList = gson.toJson(pers);
		System.out.printf("JSON Person List:\n%s\n\n", jsonPerList);

		String jsonPerArr = gson.toJson(persArr);
		System.out.printf("JSON Person Array:\n%s\n\n", jsonPerArr);

//		// Map to Back to objects
		Person per1R = gson.fromJson(jsonPer1, Person.class);
		System.out.printf("Recreated Person 1:\n%s\n\n", per1R);

		Person per2R = gson.fromJson(jsonPer2, Person.class);
		System.out.printf("Recreated Person 2:\n%s\n\n", per2R);

		List<Person> persR = gson.fromJson(jsonPerList, new TypeToken<List<Person>>() {
		}.getType());
		System.out.printf("Recreated Person List :\n%s\n\n", persR);

		Person[] persArrR = gson.fromJson(jsonPerList, Person[].class);
		for (int i = 0; i < persArrR.length; i++)
			System.out.printf("Recreated Person Array element %d:\n%s\n", i, persArrR[i]);
		System.out.println();

		Client client1R = gson.fromJson(jsonPer1, Client.class);
		System.out.printf("Recreated Client 1:\n%s\n", client1R);

	}

}
