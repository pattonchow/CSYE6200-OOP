package workspace_2021_9_yao_zhou_school;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class School {
	
	public static List<Student> studentRoster = new ArrayList<Student>() {
		@Override
		public String toString() {
			String result = "";
			for(Student s : this) {
				String str = "ID: " + s.getID() + " Age: " + s.getAge() + " Last Name: " + s.getLastName()
				+ " GPA: " + s.getGpa() + "\n";
				result += str;
			}
			return result;
		}
	};
	
	public static List<Person> personRoster = new ArrayList<Person>() {
		@Override
		public String toString() {
			String result = "";
			for(Person p : this) {
				String str = ""; 
				str += "ID: " + p.getID() + " ";
				str += "Age: " + p.getAge() + " ";
				str += " Last Name: " + p.getLastName() + " ";
				if(p instanceof Student)
					str += "GPA:" + ((Student)p).getGpa() + "\n";
				else
					str += "N/A" + "\n";
				result += str;
			}
			return result;
		}
	};
	
	public static void demo(){
		//Add Student to Student List
		studentRoster.add(new Student(1,19,"Watson",3.26));
		studentRoster.add(new Student(2,21,"Underwood",2.85));
		studentRoster.add(new Student(4,23,"Patton",3.68));
		studentRoster.add(new Student(3,20,"Franklin",3.44));
		studentRoster.add(new Student(5,22,"Swift",3.27));
		studentRoster.add(new Student(7,18,"Anderson",3.17));
		
		//Add Student to Person List
		personRoster.add(new Student(1,19,"Watson",3.26));
		personRoster.add(new Student(2,21,"Underwood",2.85));
		personRoster.add(new Student(4,23,"Patton",3.68));
		personRoster.add(new Person(0,44,"Peters"));
		personRoster.add(new Student(3,20,"Franklin",3.44));
		personRoster.add(new Student(5,22,"Swift",3.27));
		personRoster.add(new Student(7,18,"Anderson",3.17));
		
		//Sort PersonList by ID comparator
		Collections.sort(personRoster, new IdComparator());
		System.out.print("Sort Person By ID Comparator: \n");
		System.out.println(personRoster);
		
		//Sort PersonList by Age comparator
		Collections.sort(personRoster, new AgeComparator());
		System.out.print("Sort Person By Age Comparator: \n");
		System.out.println(personRoster);
		
		//Sort PersonList by Last Name comparator
		Collections.sort(personRoster, new LastNameComparator());
		System.out.print("Sort Person By Last Name Comparator: \n");
		System.out.println(personRoster);
		
		//Sort PersonList by GPA comparator
		Collections.sort(personRoster, new GpaComparator());
		System.out.print("Sort Person By GPA Comparator: \n");
		System.out.println(personRoster);
		
		//Sort StudentList by ID comparator
		Collections.sort(studentRoster, new IdComparator());
		System.out.print("Sort Person By ID Comparator: \n");
		System.out.println(studentRoster);
		
		//Sort StudentList by Age comparator
		Collections.sort(studentRoster, new AgeComparator());
		System.out.print("Sort Person By Age Comparator: \n");
		System.out.println(studentRoster);
		
		//Sort StudentList by Last Name comparator
		Collections.sort(studentRoster, new LastNameComparator());
		System.out.print("Sort Person By Last Name Comparator: \n");
		System.out.println(studentRoster);
		
		//Sort StudentList by GPA comparator
		Collections.sort(studentRoster, new GpaComparator());
		System.out.print("Sort Person By GPA Comparator: \n");
		System.out.println(studentRoster);
	}

}
