package workspace_2021_9_yao_zhou_csv1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
	
	protected double wage;
	
	public Teacher(int ID, int age, String fname, String lname, double wage) {
		super(ID, age, fname, lname, "", "");
		this.wage = wage;
	}
	
	public Teacher(double wage) {
		super();
		this.wage = wage;
	}
	
	public Teacher(String csvData) {
		super(csvData);
		int ID = 0;
		int age = 0;
		double wage = 0.0;
		String[] tokens = csvData.split(",");
		ID = Integer.parseInt(tokens[0]);
		age = Integer.parseInt(tokens[1]);
		wage = Double.parseDouble(tokens[5]);
		this.ID = ID;
		this.age = age;
		this.wage = wage;
		this.fname = tokens[2];
		this.lname = tokens[3];
	}
	
	public double getWage() {
		return wage;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#").append(this.getID());
		sb.append(" ").append(this.getFirstName());
		sb.append(" ").append(this.getLastName());
		sb.append(", age ").append(this.getAge());
		sb.append(", earning a hourly wage of ").append(this.getWage());
		
		
		return sb.toString();
	}
	
	public static void demo() {
	
		
		/**
		 * write a CSV file with Teacher data
		 */
		FileUtility fileUtil = new FileUtility();
		String fileName = "teachers.txt";
		List<String> writeTeacherCSVData = new ArrayList<String>(
				Arrays.asList(
				"5,52,Water,White,10024,41.75")
				);
		fileUtil.writeTextFile(fileName, writeTeacherCSVData);

		/**
		 * read a CSV file with Teacher data
		 */
		List<String> readCSVData = fileUtil.readTextFile(fileName);	
		readCSVData.forEach(System.out::println);
		
		/**
		 * Create Teacher objects using Teacher CSV data
		 * read from CSV file
		 */
		List<Teacher> teachers = new ArrayList<>();
		for (String string : readCSVData) {
			teachers.add(new Teacher(string));
		}
		
		/**
		 * Show Teacher state
		 */
		System.out.println(teachers.size() + " Teacher objects in list.");
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}


	}

}
