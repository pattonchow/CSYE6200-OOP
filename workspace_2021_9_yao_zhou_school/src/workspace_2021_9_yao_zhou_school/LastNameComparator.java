package workspace_2021_9_yao_zhou_school;
import java.util.Comparator;

public class LastNameComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
	}

}
