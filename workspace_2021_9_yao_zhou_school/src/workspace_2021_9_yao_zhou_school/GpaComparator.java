package workspace_2021_9_yao_zhou_school;
import java.util.Comparator;

public class GpaComparator implements Comparator<Person>{
	
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

}
