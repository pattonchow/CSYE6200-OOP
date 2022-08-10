package workspace_2021_9_yao_zhou_csv1;

import java.util.Comparator;


public class Person {
	
	protected int ID;
	protected int age;
	protected String fname;
	protected String lname;
	protected String Pfname;
	protected String Plname;
	
	public Person(int ID, int age, String fname, String lname, String Pfname, String Plname){
		this.ID = ID;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.Pfname = Pfname;
		this.Plname = Plname;
	}
	
	public Person(String csvData) {
		String[] tokens = csvData.split(",");
		int ID = Integer.parseInt(tokens[0]);
		int age = Integer.parseInt(tokens[1]);
		this.ID = ID;
		this.age = age;
		this.fname = tokens[2];
		this.lname = tokens[3];
		this.Pfname = tokens[4];
		this.Plname = tokens[5];
	}
	
	public Person() {
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	
	public String getLastName() {
		return lname;
	}
	
	public void setLastName(String lname) {
		this.lname = lname;
	}
	
	public String getParentFirstName() {
		return Pfname;
	}
	
	public void setParentFirstName(String Pfname) {
		this.Pfname = Pfname;
	}
	
	public String getParentLastName() {
		return Plname;
	}
	
	public void setParentLastName(String Plname) {
		this.Plname = Plname;
	}
	
	public static Comparator<Person>IDComparator(){
		return new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getID(), p2.getID());
			}
			
		};
	}
	
	public static Comparator<Person>AgeComparator(){
		return new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getAge(), p2.getAge());
			}
			
		};
	}	
	
	public static Comparator<Person>FirstNameComparator(){
		return new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
			
		};
	}	
	
	public static Comparator<Person>LastNameComparator(){
		return new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
			
		};
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Person [v ");
		sb.append(" # ").append(ID);
		sb.append(" ").append(fname);
		sb.append(" ").append(lname);
		sb.append(", age ").append(age);
		sb.append(", child of ").append(Pfname);
		sb.append(" ").append(Plname);

		return sb.toString();
	}

}
