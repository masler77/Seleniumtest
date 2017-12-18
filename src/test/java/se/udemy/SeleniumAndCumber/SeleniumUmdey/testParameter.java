package se.udemy.SeleniumAndCumber.SeleniumUmdey;

import java.util.List;
import se.udemy.SeleniumAndCumber.SeleniumUmdey.util.CSV_reader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import se.udemy.SeleniumAndCumber.SeleniumUmdey.util.CSV_reader;;

@RunWith(value = Parameterized.class)
public class testParameter {
	String name,email,phone, gender, password,  country;
	String weekly, monthly,  sometimes;



	@Test
	public void test1(){
		
		
		System.out.println("name: " + name);
//		System.out.println(password+name);

	}


	@Parameters
	public static List<String[]> getData() {
		return CSV_reader.get("C:\\Temp\\sd\\User.csv");

	}
	public testParameter(String name, String email, String phone, String gender,
			String password){

		this.name = name;
		this.email = email;
		this.phone = email;
		this.gender = gender;
		this.password = password;
		this.country = country;
		this.weekly = weekly;
		this.monthly = monthly;
		this.sometimes = sometimes;

	}

//
//	public testParameter(String name, String email, String phone, String gender,
//			String password, String country,String weekly, String monthly,  String sometimes ){
//
//		this.name = name;
//		this.email = email;
//		this.phone = email;
//		this.gender = gender;
//		this.password = password;
//		this.country = country;
//		this.weekly = weekly;
//		this.monthly = monthly;
//		this.sometimes = sometimes;
//
//	}

}