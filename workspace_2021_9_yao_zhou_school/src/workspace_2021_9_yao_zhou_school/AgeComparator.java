package workspace_2021_9_yao_zhou_school;
import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}

}
