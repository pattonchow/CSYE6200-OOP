package workspace_2021_9_yao_zhou_csv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;


public class Student extends Person implements Comparable<Student>{
	
	protected int stuID;
	protected double gpa;
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.stuID, o.getStuID());
	}
	
	public Student(int ID, int age, String fname, String lname, String Pfname, String Plname, int stuID, double gpa){
		super(ID, age, fname, lname, Pfname, Plname);
		this.stuID = stuID;
		this.gpa = gpa;
	}
	
	public Student(String csvData) {
		super(csvData);
		int ID = 0;
		int age = 0;
		int stuID = 0;
		double gpa = 0.0;
		String[] tokens = csvData.split(",");
		ID = Integer.parseInt(tokens[0]);
		age = Integer.parseInt(tokens[1]);
		stuID = Integer.parseInt(tokens[6]);
		gpa = Double.parseDouble(tokens[7]);
		this.ID = ID;
		this.age = age;
		this.fname = tokens[2];
		this.lname = tokens[3];
		this.Pfname = tokens[4];
		this.Plname = tokens[5];
		this.stuID = stuID;
		this.gpa = gpa;
	}
	
	public int getStuID() {
		return stuID;
	}
	
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public static Comparator<Person> GpaComparator() {
		return new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				if((p1 instanceof Student) && (p2 instanceof Student)) {
					Student s1 =(Student)p1;
					Student s2 =(Student)p2;
					return Double.compare(s1.getGpa(), s2.getGpa());
				}
				if(!(p1 instanceof Student)) {
					return Integer.MAX_VALUE;
				}
				if(!(p2 instanceof Student)) {
					return Integer.MIN_VALUE;
				}
				else
					return 0;
			}
		};
	}
	
	public static Comparator<Person> StuIDComparator() {
		return new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				if((p1 instanceof Student) && (p2 instanceof Student)) {
					Student s1 =(Student)p1;
					Student s2 =(Student)p2;
					return Integer.compare(s1.getStuID(), s2.getStuID());
				}
				if(!(p1 instanceof Student)) {
					return Integer.MAX_VALUE;
				}
				if(!(p2 instanceof Student)) {
					return Integer.MIN_VALUE;
				}
				else
					return 0;
			}
		};
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" # ").append(this.getID());
		sb.append(", StuID: ").append(this.stuID);
		sb.append(" ").append(this.getFirstName());
		sb.append(" ").append(this.getLastName());
		sb.append(", age ").append(this.getAge());
		sb.append(", having a GPA of ").append(this.getGpa());
		sb.append(", Parent: ").append(this.getParentFirstName());
		sb.append(" ").append(this.getParentLastName());

		return sb.toString();
	}
	
	public static void demo() {
		
		FileUtility fileUtility = new FileUtility();
		String fileName = "students.txt";
		List<String> StuCSVData = new ArrayList<String>(
//		students.add(new Student(1,19,"Emma","Watson","James","Watson",101,3.26));
//		students.add(new Student(2,21,"Joshua","Underwood","Matt","Underwood",102,2.85));
//		students.add(new Student(3,23,"Vincent","Patton","Star","Patton",103,3.68));
//		students.add(new Student(1,19,"Emma","Watson","James","Watson",101,3.26));
				Arrays.asList(
				"1,19,Emma,Watson,James,Watson,101,3.26",
				"2,21,Joshua,Underwood,Matt,Underwood,102,2.85",
				"3,23,George,Patton,Jack,Patton,103,3.68",
				"4,20,Ronald,Franklin,William,Franklin,104,3.44")
				);
		fileUtility.writeTextFile(fileName, StuCSVData);
		List<String> readCSVData = fileUtility.readTextFile(fileName);	
		readCSVData.forEach(System.out::println);
		
		{
			/**
			 * Create Student objects using Student CSV data
			 * read from CSV file
			 */
			List<Student> students = new ArrayList<>();
			for (String string : readCSVData) {
				students.add(new Student(string));
			}
			
			/**
			 * Show Student state
			 */
			System.out.println(students.size() + " Student objects in list.");
			for (Student student : students) {
				System.out.println(student);
			}
			
		}
		
		{
			/**
			 * Create Student objects using Student CSV data
			 * read from CSV file
			 */
			StudentFactory factory = new StudentFactory();
			List<Person> students = new ArrayList<>();
			for (String string : readCSVData) {
				students.add(factory.getObject(string));
			}
			
			/**
			 * Show Student state
			 */

			for (Person student : students) {
				System.out.println(student);
			}
			/**
			 * Sort Student roster
			 */
			System.out.println("Sort Students by ID:");
			students.sort(Person.IDComparator());
			students.forEach(System.out::println);
			System.out.println("Sort Students by Student ID:");
			students.sort(Student.StuIDComparator());
			students.forEach(System.out::println);
			System.out.println("Sort Students by FIRST NAME:");
			students.sort(Person.FirstNameComparator());
			students.forEach(System.out::println);
			System.out.println("Sort Students by LAST NAME:");
			students.sort(Person.LastNameComparator());
			students.forEach(System.out::println);
			
			
			System.out.println("Sort Students by GPA:");
			students.sort(Student.GpaComparator());
			students.forEach(System.out::println);
			
			

		}
			
	}
}
