package workspace_2021_9_yao_zhou_school;

public class Student extends Person{
	protected double gpa;
	
	Student(int ID, int age, String LastName, double gpa){
		super(ID, age, LastName);
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
