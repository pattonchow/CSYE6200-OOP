package workspace_2021_9_yao_zhou_csv1;

public class StudentFactory {
	
	public Student getObject(String csvData) {
		return new Student(csvData);
	}

}
