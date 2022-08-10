package workspace_2021_9_yao_zhou_school;

public class Person {
	protected int ID;
	protected int age;
	protected String LastName;
	
	Person(int ID, int age, String LastName){
		this.ID = ID;
		this.age = age;
		this.LastName = LastName;
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
	
	public void setAge(int Age) {
		this.age = Age;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

}
