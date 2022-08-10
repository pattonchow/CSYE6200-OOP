package workspace_2021_9_yao_zhou_school;

import java.util.Comparator;
public class IdComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.getID(), p2.getID());
	}

}
