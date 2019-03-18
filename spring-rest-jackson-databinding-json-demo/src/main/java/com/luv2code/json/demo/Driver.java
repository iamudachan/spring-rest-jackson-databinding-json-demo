package com.luv2code.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		
		try {
//			create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
//			read json file and convert to the pojo  
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
//			print firstname and lastname
			
			System.out.println("FirstName = "+student.getFirstName() +"- Last Name = "+student.getLastName());
			System.out.println("Address = "+student.getAddress().getCountry() +"- zip code = "+student.getAddress().getZip());
			System.out.println("Language = "+student.getLanguages()[0].toString());
			
			Address address = student.getAddress();
			System.out.println(address.getCity()+" : "+address.getState());
			
			for(String temp:student.getLanguages()) {
				System.out.println(temp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
