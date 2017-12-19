package se.udemy.SeleniumAndCumber.SeleniumUmdey;

import java.util.List;

import se.udemy.SeleniumAndCumber.SeleniumUmdey.util.CSV_reader;
import se.udemy.SeleniumAndCumber.SeleniumUmdey.util.Excel;

public class CSVreaders {

	public static void main(String[] args) {

		//readCSV();
		readXLS();
		
	}
	public static void readCSV(){
		
		String filename = "C:\\Temp\\sd\\UserAccounts.csv";
		List <String[]> records = CSV_reader.get(filename);
		
		
		//läser igenom CSV-filen.
		for(String[] record : records){
			for(String field : record){
				System.out.println(field);
			}
		}
		
	}

public static void readXLS(){
	String filename = "C:\\Temp\\sd\\UserLogin.xls";
		String[][] data = Excel.get(filename);
	
		for(String[] records : data){
			System.out.println("\nNew profile:");
			System.out.println(records[0]);
			System.out.println(records[1]);
			System.out.println(records[2]);
			
			
		}
	}

}
